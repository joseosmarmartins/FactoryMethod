package com.joseosmar;

public class AulaNormal extends Aula {

    private String conteudo;

    public AulaNormal(String conteudo) {
        setDisciplina("Padr�es de projeto");
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
