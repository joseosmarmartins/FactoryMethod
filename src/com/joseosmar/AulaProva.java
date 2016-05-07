package com.joseosmar;

import java.util.Date;

public class AulaProva extends Aula {

    private String materiaProva;
    private Date dataProva;

    public AulaProva(String materiaProva, Date dataProva) {
        setDisciplina("Padrões de projeto");
        this.materiaProva = materiaProva;
        this.dataProva = dataProva;
    }

    public String getMateriaProva() {
        return materiaProva;
    }

    public void setMateriaProva(String materiaProva) {
        this.materiaProva = materiaProva;
    }

    public Date getDataProva() {
        return dataProva;
    }

    public void setDataProva(Date dataProva) {
        this.dataProva = dataProva;
    }
}
