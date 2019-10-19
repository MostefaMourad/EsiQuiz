package com.company.Quiz.Reponse;

import com.company.Quiz.Question.Question;

public class ReponseQO extends Reponse{
    private String reponse="";

    public ReponseQO() {
    }

    public ReponseQO(int question) {
        super(question);
    }

    public ReponseQO(int question, String reponse) {
        super(question);
        this.reponse = reponse;
    }

    public ReponseQO(String reponse) {
        this.reponse = reponse;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    @Override
    public double evaluer(Question question) {
      String[] str = question.getReponsesCorrectes();
      for(int i=0;i<str.length;i++){
          if(str[i].compareTo(this.reponse)==0){
              return 100.0d;
          }
      }
      return 0.0d;
    }
}
