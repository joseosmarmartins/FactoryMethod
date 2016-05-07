package com.joseosmar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        AulaFactory factory = new AulaFactory();

        String descricaoAulaNormal = "Conteudo da aula de padrões de projeto";
        String descricaoAulaProva = "Prova de padrões de projeto";

        Calendar calendar = new GregorianCalendar();
        calendar.set(2016, Calendar.MAY, 06);
        Date dataProva = calendar.getTime();

        System.out.println(((AulaNormal) factory.getAula(descricaoAulaNormal, null)).getConteudo());
        System.out.println(((AulaProva) factory.getAula(descricaoAulaProva, dataProva)).getMateriaProva() + " dia: " +
                ((AulaProva) factory.getAula(descricaoAulaProva, dataProva)).getDataProva());
    }
}
