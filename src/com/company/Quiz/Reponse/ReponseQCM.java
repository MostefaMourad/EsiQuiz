package com.company.Quiz.Reponse;

import com.company.Quiz.Question.QCM;
import com.company.Quiz.Question.Question;

public class ReponseQCM extends Reponse {
    private boolean[] choixEffectue;

    public ReponseQCM(int question) {
        super(question);
        this.choixEffectue=new boolean[6];
        for(int i=0;i<6;i++){
            this.choixEffectue[i]=false;
        }
    }

    public ReponseQCM() {
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
    public double evaluer(Question question) {
        double note=0;
        boolean done = false;
        int length = ((QCM) question).getChoice().length;
        String[] repj = ((QCM)question).getReponsesCorrectes();

        String[] repf = ((QCM)question).getReponsesIncorrectes();
        for(int i=0;i<length;i++){
            String reponse = ((QCM)question).getChoice()[i];
            done=false;
            if(choixEffectue[i]==true){
                for(int j=0;j<repj.length;j++){
                    if(repj[j].compareTo(reponse)==0){
                        note += Math.ceil(100/length);
                        done=true;
                    }
                }
                if(!done){
                    note-=Math.ceil(100/length);
                }
            }
            else{
                for(int k=0;k<repf.length;k++){
                    if(repf[k].compareTo(reponse)==0){
                        note += Math.ceil(100/length);
                        done=true;
                    }
                }
                if(!done){
                    note-=Math.ceil(100/length);
                }
            }
        }
        if(note>0){
            return note;
        }
        else if(note>100){
            return 100;
        }
        else{
            return 0;
        }
    }

}
