package com.company.Quiz;

import com.company.Quiz.Question.Question;

import java.util.ArrayList;
import java.util.List;

public class Notion {
    private String nom;
    private List<Question> questions =new ArrayList<Question>();

    public Notion(String nom, List<Question> questions) {
        this.nom = nom;
        this.questions = questions;
    }

    public Notion(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Notion() {
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void ajouterQuestion(Question question){
        this.questions.add(question);
    }
    public boolean supprimerQuestion(Question question)
    {
        return false;
    }
    public void modifierQuestion(Question question){

    }
    public String toString(){
        String string="";
        string="\t\t\t\t"+this.nom+"\n";
        for(Question q :this.questions) {
            string += q.toString();
            string += "\n";
        }
        return string;
    }
}
