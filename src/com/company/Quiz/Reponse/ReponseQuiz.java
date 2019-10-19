package com.company.Quiz.Reponse;

import com.company.Quiz.Quiz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReponseQuiz extends Quiz {
    private List<Reponse> reponses = new ArrayList<Reponse>();
    private double tauxAccopli;
    private double tauxReussite;

    public ReponseQuiz(List<Reponse> reponses) {
        this.reponses = reponses;
        tauxAccopli =0.0d;
        tauxReussite=0.0d;
    }

    public ReponseQuiz(String nom, LocalDate dateOuverture, LocalDate dateExpiration) {
        super(nom, dateOuverture, dateExpiration);
        tauxAccopli =0;
        tauxReussite=-1;
    }

    public ReponseQuiz(List<Reponse> reponses, double tauxAccopli, double tauxReussite) {
        this.reponses = reponses;
        this.tauxAccopli = tauxAccopli;
        this.tauxReussite = tauxReussite;
    }

    public ReponseQuiz() {
        tauxAccopli =0.0d;
        tauxReussite=-1;
    }

    public List<Reponse> getReponses() {
        return reponses;
    }

    public void setReponses(List<Reponse> reponses) {
        this.reponses = reponses;
    }

    public double getTauxAccopli() {
        return tauxAccopli;
    }

    public void setTauxAccopli(double tauxAccopli) {
        this.tauxAccopli = tauxAccopli;
    }

    public double getTauxReussite() {
        return tauxReussite;
    }

    public void setTauxReussite(double tauxReussite) {
        this.tauxReussite = tauxReussite;
    }
    public double Evaluer(){return 0.0d;}

    @Override
    public String toString() {
        String str="";
        str=this.getNom()+"\t|"+this.getDateOuverture().toString()+"   \t|"+this.getDateExpiration().toString()+"   \t|"+this.tauxAccopli+"%      \t|"+this.tauxReussite+"%";
        return str;
    }
}
