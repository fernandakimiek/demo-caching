package com.example.demo.democaching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CachingApp implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CachingApp.class);

    private final ContatoRepositorio contatoRepositorio;

    public CachingApp(ContatoRepositorio contatoRepositorio){
        this.contatoRepositorio = contatoRepositorio;
    }

    @Override
    public void run(String...args) throws  Exception{

        logger.info("...Localizando contato");
        logger.info("contato - 1" + contatoRepositorio.getByNome("Fernanda Kishimoto"));
        logger.info("contato - 2" + contatoRepositorio.getByNome("João Silva"));
        logger.info("contato - 1" + contatoRepositorio.getByNome("Fernanda Kishimoto"));
        logger.info("contato - 2" + contatoRepositorio.getByNome("João Silva"));
        logger.info("contato - 1" + contatoRepositorio.getByNome("Fernanda Kishimoto"));
    }

}
