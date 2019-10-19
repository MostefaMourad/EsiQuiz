package com.company.Quiz.Question;

public class QO extends Question {
    public QO(String question, String[] reponsesCorrectes) {
        super(question, reponsesCorrectes);
    }

    public QO() {
    }

    @Override
    public String toString() {
        return this.getQuestion();
    }

}
