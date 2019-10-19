package com.company.Quiz.Reponse;

import com.company.Quiz.Question.Question;

public abstract class Reponse implements Evaluer {
    protected boolean repondu;
    protected int question;

    public Reponse(int question) {
        repondu=false;
        this.question = question;
    }

    public Reponse() {
        repondu=false;
    }

    public boolean isRepondu() {
        return repondu;
    }

    public void setRepondu(boolean repondu) {
        this.repondu = repondu;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }
}
