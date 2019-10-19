package com.company.Quiz.Question;

import java.util.Random;

public class QCM extends Question{
    private String[] ReponsesIncorrectes;
    private String[] choice;
    public QCM(String question, String[] reponsesCorrectes, String[] reponsesIncorrectes) {
        super(question, reponsesCorrectes);
        ReponsesIncorrectes = reponsesIncorrectes;
        this.random();
    }

    public QCM() {
    }

    public String[] getChoice() {
        return choice;
    }

    public void setChoice(String[] choice) {
        this.choice = choice;
    }

    public String[] getReponsesIncorrectes() {
        return ReponsesIncorrectes;
    }

    public void setReponsesIncorrectes(String[] reponsesIncorrectes) {
        ReponsesIncorrectes = reponsesIncorrectes;
    }

    @Override
    public String toString() {
        String str=this.getQuestion();
        str+="\n";

        for (int i=0;i<this.choice.length;i++){
            str+="\t-";
            str+=choice[i];
            str+="\n";
        }
        return str;
    }
    public void random(){
        int lengh=this.getReponsesIncorrectes().length+this.getReponsesCorrectes().length;
        choice = new String[lengh];
        Random rgen = new Random();
        for(int i=0;i<this.getReponsesIncorrectes().length;i++){
            this.choice[i]=this.ReponsesIncorrectes[i];
        }
        for(int i=0;i<this.getReponsesCorrectes().length;i++){
            this.choice[i+ReponsesIncorrectes.length]=this.reponsesCorrectes[i];
        }
        for(int i=0;i<lengh;i++){
            int randPos = rgen.nextInt(lengh);
            String tmp = this.choice[i];
            this.choice[i]=this.choice[randPos];
            this.choice[randPos]=tmp;
        }
    }
}
