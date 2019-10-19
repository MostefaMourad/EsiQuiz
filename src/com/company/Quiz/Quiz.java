package com.company.Quiz;

import com.company.Quiz.Question.Question;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String nom;
    private LocalDate dateOuverture;
    private LocalDate dateExpiration;
    private boolean ouvert;
    private List<Question> questions = new ArrayList<Question>();

    public Quiz(String nom) {
        this.nom = nom;
    }

    public Quiz(String nom, LocalDate dateOuverture, LocalDate dateExpiration) {
        this.nom = nom;
        this.dateOuverture = dateOuverture;
        this.dateExpiration = dateExpiration;
        this.ouvert=false;
    }

    public Quiz(String nom, LocalDate dateOuverture, LocalDate dateExpiration, List<Question> questions) {
        this.nom = nom;
        this.dateOuverture = dateOuverture;
        this.dateExpiration = dateExpiration;
        this.ouvert = false;
        this.questions = questions;
    }

    public Quiz() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(LocalDate dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public boolean isOuvert() {
        return ouvert;
    }

    public void setOuvert(boolean ouvert) {
        this.ouvert = ouvert;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void modifier(){}
    public boolean supprimer(Question question){return false;}
    public boolean changer(int ind){return false;}
    public void suspension(){}

    @Override
    public String toString() {
        String str ="";
        str = "\t\t\t\t"+this.nom+"\n"+"\t-Date d'ouverture :"+this.dateOuverture.toString()+"\n\t-Date de Fermeture :"+this.dateExpiration.toString()+"\n\n";
        for (Question elm:this.questions){
            str+="\n\n";
            str+=elm.toString();
        }
        return str;
    }
}
