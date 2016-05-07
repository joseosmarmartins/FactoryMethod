package com.joseosmar;

import java.util.Date;

public class AulaFactory {

    public Aula getAula(String descricao, Date dataProva) {
        if (dataProva != null) {
            return new AulaProva(descricao, dataProva);
        } else {
            return new AulaNormal(descricao);
        }
    }
}
