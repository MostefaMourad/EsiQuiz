package com.company.Quiz.Reponse;

import com.company.Quiz.Question.QCU;
import com.company.Quiz.Question.Question;

public class ReponseQCU extends Reponse {
    private boolean[] choixEffectue;

    public ReponseQCU(int question) {
        super(question);
        this.choixEffectue=new boolean[6];
        for(int i=0;i<6;i++){
            this.choixEffectue[i]=false;
        }
    }

    public ReponseQCU() {
    }

    public boolean[] getChoixEffectue() {
        return choixEffectue;
    }

    public void setChoixEffectue(boolean[] choixEffectue) {
        this.choixEffectue = choixEffectue;
    }

    public void select(int ind){
        this.choixEffectue[ind-1]=true;
    }
    @Override
    public double evaluer(Question question) { ;
    String[] str = ((QCU)question).getReponsesCorrectes();
    for(int i=0;i<choixEffectue.length;i++){
        if(choixEffectue[i]==true){
            String repon = ((QCU)question).getChoice()[i];
            for(int j=0;j<str.length;j++){
                if(str[j].compareTo(repon)==0){
                    return 100.0d;
                }
            }
            return 0.0d;
        }
    }
    return 0.0d;
    }

}
