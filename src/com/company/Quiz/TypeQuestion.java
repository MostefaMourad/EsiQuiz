package com.company.Quiz;

public enum TypeQuestion {
    QCU("qcu"), QCM("qcm"), QO("qo");

    private String name = "";

    TypeQuestion(String n) {
        name = n;
    }

    public String toString() {
        return name;
    }
}
