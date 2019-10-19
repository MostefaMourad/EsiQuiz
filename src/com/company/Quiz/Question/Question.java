package com.company.Quiz.Question;

import com.company.Quiz.TypeQuestion;



public abstract class Question {
    protected String question;
    protected String[] reponsesCorrectes;

    public Question(String question, String[] reponsesCorrectes) {
        this.question = question;
        this.reponsesCorrectes = reponsesCorrectes;

    }
    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getReponsesCorrectes() {
        return reponsesCorrectes;
    }

    public void setReponsesCorrectes(String[] reponsesCorrectes) {
        this.reponsesCorrectes = reponsesCorrectes;
    }

}
