package com.example.demo.democaching;



public class Contato {

    private String nome;
    private String apelido;
    private Long telefone;

    public Contato(String nome,String apelido,Long telefone){
        this.nome = nome;
        this.apelido = apelido;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "Contato{" + "nome="+ nome + "/ apelido= " + apelido + "/telefone= "+ telefone+"}";
    }
}
