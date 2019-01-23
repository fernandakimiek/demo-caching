package com.example.demo.democaching;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class Repositorio implements ContatoRepositorio {



    @Override
    @Cacheable("contatos")
    public Contato getByNome(String nome){
        simulaSemCache();
        return new Contato(nome,"apelido tal", (long) 1234545);
    }

    private void simulaSemCache(){
        try{
            long time = 3000L;
            Thread.sleep(time);
        }catch (InterruptedException e){
            throw new IllegalStateException(e);
        }
    }
}
