package com.company.Gestion;

import com.company.Quiz.Notion;
import com.company.Quiz.Question.Question;
import com.company.Quiz.Quiz;
import com.company.Quiz.Reponse.Reponse;
import com.company.Quiz.Reponse.ReponseQuiz;
import com.company.Test.Donnee;
import javafx.scene.transform.Scale;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Formateur {
    private Compte formteur;
    private List<Quiz> quizzes = new ArrayList<Quiz>();
    private static Formation formation;
    private static int num;

    public Formateur(Compte formteur) {
        this.formteur = formteur;
    }

    public Formateur() {
    }

    public Compte getFormteur() {
        return formteur;
    }

    public void setFormteur(Compte formteur) {
        this.formteur = formteur;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public static Formation getFormation() {
        return formation;
    }

    public static void setFormation(Formation formation) {
        Formateur.formation = formation;
    }

    public Quiz genererQuiz(){
        Quiz quiz = initQuiz();
        List<Question> questions  = new ArrayList<Question>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String choix;
        int nbre;

       for(int i=0;i<formation.getContenue().size();i++){
           System.out.println("Voulez vous Choisir des questions de \""+formation.getContenue().get(i).getNom()+"\" (o/n)");
           choix = sc.nextLine();
           if(choix.toLowerCase().compareTo("o")==0){
               System.out.println("Combien de question vous voulez choisir");
               nbre = sc1.nextInt();
               AleaQuiz(formation.getContenue().get(i),nbre,questions);
           }
       }
       quiz.setQuestions(questions);
       return quiz;
    }

    public ReponseQuiz genererQuizAuto(){
        ReponseQuiz quiz = initQuizAuto();
        List<Reponse> list = new ArrayList<Reponse>();
        List<Question> questions  = new ArrayList<Question>();
        for(int i=0;i<formation.getContenue().size();i++){
                AleaQuiz(formation.getContenue().get(i),3,questions);
        }

        quiz.setQuestions(questions);
        return quiz;
    }

  //  public void validerQuiz(){}

    public boolean modifierQuiz(int quiz){return false;}

    public boolean supprimerQuestion(int quiz){return false;}

    public boolean changerQuestion(int quiz){return false;}

    public void ajouterApprenant(Compte compte){
      formation.getGroupeApprenants().add(compte);
    }

    public boolean supprimerCompte(Compte c){
        if(formation.getGroupeApprenants().contains(c)){
            formation.getGroupeApprenants().remove(c);
            return true;
        }
        else{
            System.out.println("Le compte n'existe pas");
            return false;
        }

    }

    public boolean modifierCompte(Compte c){
        if(formation.getGroupeApprenants().contains(c)){
            String[] str = {"Nom","Prénom","Adresse","Login","Mot de passe","Date de naissance"};
            String choix;
            for(int i=0;i<6;i++){
                if(i<5){
                    System.out.println("Voulez-vous modifier :"+str[i]+" (o/n)");
                    choix = new Scanner(System.in).nextLine();
                    if(choix.toLowerCase().compareTo("o")==0){
                        System.out.println("Entrer le :"+str[i]);
                        switch (i){
                            case 0:
                                c.setNom(new Scanner(System.in).nextLine());
                                break;
                            case 1:
                                c.setPrenom(new Scanner(System.in).nextLine());
                                break;
                            case 2:
                                c.setAdresse(new Scanner(System.in).nextLine());
                                break;
                            case 3:
                                c.setLogin(new Scanner(System.in).nextLine());
                                break;
                            case 4:
                                c.setMotDePasse(new Scanner(System.in).nextLine());
                                break;
                        }
                    }
                }
                else {
                    System.out.println("Entrer l'année/mois/jours");
                    c.setDateDeNaissance(LocalDate.of(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt()));
                }
            }
         int indice = formation.getGroupeApprenants().indexOf(c);
         formation.getGroupeApprenants().add(indice,c);
         formation.getGroupeApprenants().remove(indice+1);
         return true;
        }
        else {
            System.out.println("Le compte n'existe pas");
            return false;
        }

    }

    public void ConsulterApprenant(){
        Donnee donnee = new Donnee();
        System.out.println("______________________________________________________________________");
        System.out.println("Nom   "+"\t|"+"DateOuverture"+"\t|"+"DateExpiration"+"\t|"+"tauxAccopli"+"\t|"+"tauxReussite");
        System.out.println("______________________________________________________________________");
        for (ReponseQuiz elm:donnee.quizListOuvert1){
                System.out.println(elm.toString());
        }
        System.out.println("______________________________________________________________________");
    }

    public Formation creerFormation(){return new Formation();}

    public void EvaluerApprenants(){
      Donnee donnee = new Donnee();
      double moy1=0,moy2=0;
      int it1=0,it2=0;
        for (ReponseQuiz elm:donnee.quizListOuvert1){
            if(elm.getTauxReussite()>=0){
                moy1+=elm.getTauxReussite();
                it1++;
            }
        }
        try{
            moy1=moy1/it1;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        for (ReponseQuiz elm:donnee.quizListOuvert2){
            if(elm.getTauxReussite()>=0){
                moy2+=elm.getTauxReussite();
                it2++;
            }
        }
        try{
            moy2=moy2/it2;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Apprenant 1:"+String.valueOf(moy1)+"%");
        System.out.println("Apprenant 2:"+String.valueOf(moy2)+"%");
    }

    private void AleaQuiz(Notion notion,int nb,List<Question> questions){
      Question recuperer;
      Random random = new Random();
      int key,i=0;
      while (i<nb){
          key = (int)Math.ceil(Math.random()*(notion.getQuestions().size()-1));
          recuperer = notion.getQuestions().get(key);
          if(!questions.contains(recuperer)){
              questions.add(recuperer);
              i++;
          }
      }
    }

    private Quiz initQuiz(){
        Quiz quiz ;
        System.out.println("Entrer le nom du Quiz");
        String nom = new Scanner(System.in).nextLine();
        System.out.println("Entrer la date d'ouverture y=>m=>j");
        int y=new Scanner(System.in).nextInt();
        int m=new Scanner(System.in).nextInt();
        int j=new Scanner(System.in).nextInt();
        LocalDate douv = LocalDate.of(y,m,j);
        System.out.println("Entrer la date de fermeture y=>m=>j");
         y=new Scanner(System.in).nextInt();
         m=new Scanner(System.in).nextInt();
         j=new Scanner(System.in).nextInt();
        LocalDate df = LocalDate.of(y,m,j);
        quiz = new Quiz(nom,douv,df);
        return quiz;
    }
    public ReponseQuiz initQuizAuto(){
        ReponseQuiz quiz ;
        String nom = "quiz"+String.valueOf(num);
        num++;
        LocalDate douv = LocalDate.of(2019,4,14);
        LocalDate df = LocalDate.of(2019,5,14);
        quiz = new ReponseQuiz(nom,douv,df);
        return quiz;
    }
}
