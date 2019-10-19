package com.company.Gestion;

import com.company.Quiz.Question.Question;
import com.company.Quiz.Quiz;
import com.company.Quiz.Reponse.*;
import com.company.Test.Donnee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Apprenant extends Compte implements Comparable<Apprenant>{
    private List<ReponseQuiz> quizOuvertList = new ArrayList<ReponseQuiz>();
    private List<ReponseQuiz> quizAccomplisList = new ArrayList<ReponseQuiz>();

    public Apprenant(String nom, String prenom, LocalDate dateDeNaissance, String adresse) {
        super(nom, prenom, dateDeNaissance, adresse);
    }

    public Apprenant() {
    }

    public List<ReponseQuiz> getQuizOuvertList() {
        return quizOuvertList;
    }

    public void setQuizOuvertList(List<ReponseQuiz> quizOuvertList) {
        this.quizOuvertList = quizOuvertList;
    }

    public List<ReponseQuiz> getQuizAccomplisList() {
        return quizAccomplisList;
    }

    public void setQuizAccomplisList(List<ReponseQuiz> quizAccomplisList) {
        this.quizAccomplisList = quizAccomplisList;
    }

    public void afficherQuizOuvert() {
        System.out.println("\t\t\t******************************************");
        System.out.println("\t\t\t*        Liste des Quizs Ouverts         *");
        System.out.println("\t\t\t******************************************");
        System.out.println("______________________________________________________________________");
        System.out.println("Nom   "+"\t|"+"DateOuverture"+"\t|"+"DateExpiration"+"\t|"+"tauxAccopli"+"\t|"+"tauxReussite");
        System.out.println("______________________________________________________________________");
        for (ReponseQuiz elm:this.quizOuvertList){
                System.out.println(elm.toString());
        }
        System.out.println("______________________________________________________________________");
    }

    public void afficherQuizAccmplis(){
        System.out.println("\t\t\t******************************************");
        System.out.println("\t\t\t*       Liste des Quizs Accomplis        *");
        System.out.println("\t\t\t******************************************");
        System.out.println("______________________________________________________________________");
        System.out.println("Nom   "+"\t|"+"DateOuverture"+"\t|"+"DateExpiration"+"\t|"+"tauxAccopli"+"\t|"+"tauxReussite");
        System.out.println("______________________________________________________________________");
        for (ReponseQuiz elm:this.quizAccomplisList){
                System.out.println(elm.toString());
        }
        System.out.println("______________________________________________________________________");
    }

    public ReponseQuiz repondreAuQuiz(int quiz){
        int i=0;
        String choix="o";
        ReponseQuiz reponseQuiz = this.quizOuvertList.get(quiz);
        for (Question elm:reponseQuiz.getQuestions()){
            while (choix.compareTo("o")==0){

            }
        }
        return reponseQuiz;
    }
    public boolean sauvegarderReponse(int quiz){
        try {
            ReponseQuiz reponseQuiz = this.quizOuvertList.get(quiz);
            reponseQuiz.setTauxReussite(this.EvaluerReponse(reponseQuiz));
            reponseQuiz.setTauxAccopli(this.calculTauxAcomplis(reponseQuiz));
            this.quizAccomplisList.add(reponseQuiz);
            this.quizOuvertList.remove(quiz);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
    public double calculTauxAcomplis(ReponseQuiz quiz){
        double taux=0,acc;
        int nbr = quiz.getQuestions().size()+1;
        Question question=null;
        for (Reponse elm:quiz.getReponses()){
            question=quiz.getQuestions().get(elm.getQuestion());
            if(question.getClass().getSimpleName().compareTo("QCM")==0){
                ReponseQCM reponseQCM = (ReponseQCM)elm;
                for (boolean choice:reponseQCM.getChoixEffectue()){
                    if(choice==true){
                        System.out.println("QCM");
                        taux+=Math.ceil(100/nbr)+1;
                        break;
                    }
                }
            }
            else if(question.getClass().getSimpleName().compareTo("QCU")==0){
                ReponseQCU reponseQCU = (ReponseQCU)elm;
                for (boolean choice:reponseQCU.getChoixEffectue()){
                    if(choice==true){
                        System.out.println("QCU");
                        taux+=Math.ceil(100/nbr)+1;
                        break;
                    }
                }
            }
            else {
                ReponseQO reponseQO = (ReponseQO)elm;
                if(reponseQO.getReponse().compareTo("")!=0){
                    taux+=Math.ceil(100/nbr)+1;
                }
            }
        }
        if(taux>100){
            return 100;
        }
        return taux;
    }
    public double EvaluerReponse(ReponseQuiz rep){
      double moy=0,moypart;
      int iter=1;
      for(Reponse elm:rep.getReponses()){
          moypart = elm.evaluer(rep.getQuestions().get(elm.getQuestion()));
          moy+=moypart;
          iter++;
      }
      try{
          moy=moy/iter;
      }
      catch (Exception e){

      }
      return (int)Math.ceil(moy);
    }


    @Override
    public int compareTo(Apprenant o) {
      double moy1=0,moy2=0;
      int it1=0,it2=0;
        for (ReponseQuiz elm:this.quizAccomplisList){
            if(elm.getTauxReussite()>=0){
                moy1+=elm.getTauxReussite();
                it1++;
            }
        }
        try{
            moy1=moy1/it1;
        }
        catch (Exception e){
        }
        for (ReponseQuiz elm:this.quizOuvertList){
            if(elm.getTauxReussite()>=0){
                moy2+=elm.getTauxReussite();
                it2++;
            }
        }
        try{
            moy2=moy2/it2;
        }
        catch (Exception e){
        }
        return (int)Math.ceil(moy1-moy2);
    }
}
