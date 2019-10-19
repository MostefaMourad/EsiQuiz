package com.company.Test;

import com.company.Gestion.Apprenant;
import com.company.Gestion.Compte;
import com.company.Gestion.Formateur;
import com.company.Gestion.Formation;
import com.company.Quiz.Notion;
import com.company.Quiz.Question.QCM;
import com.company.Quiz.Question.QCU;
import com.company.Quiz.Question.QO;
import com.company.Quiz.Question.Question;
import com.company.Quiz.Quiz;
import com.company.Quiz.Reponse.*;
import jdk.nashorn.internal.codegen.FieldObjectCreator;
import sun.rmi.server.LoaderHandler;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Donnee {
    public  List<Notion> notions;
    public  Formation formation;
    public  Compte formateurPrincpal;
    public  List<Quiz> quizList = new ArrayList<Quiz>();
    public List<ReponseQuiz> quizListOuvert1 = new ArrayList<ReponseQuiz>();
    public List<ReponseQuiz> quizListOuvert2 = new ArrayList<ReponseQuiz>();
    public  Notion CreerNotion1(){
        Notion notion = new Notion("Java Orienté Objet");
        String[] repCor1 = {"new"};
        String[] repInc1 = {"this","public","class","private","void"};
        QCU qc1 = new QCU("Quel mot-clé doit-on utiliser pour instancier un objet ?",repCor1,repInc1);
        String[] repCor2 = {"private"};
        String[] repInc2 = {"this","public","class","new","void"};
        QCU qc2 = new QCU("Avec quel mot-clé peut-on restreindre l’étendue d’une variable, d’une méthode ou d’une classe ?",repCor2,repInc2);
        String[] repCor3 = {"static"};
        String[] repInc3 = {"Aucun","public","class","private","this"};
        QCU qc3 = new QCU("Quel mot-clé permet de créer une variable de classe ?",repCor3,repInc3);
        String[] repCor4 = {"super"};
        String[] repInc4 = {"this","public","class","private","static"};
        QCU qc4 = new QCU("Avec quel mot-clé peut-on accéder aux méthodes d'une classe mère lorsque vous créez une classe héritée ?",repCor4,repInc4);
        String[] repCor5 = {"Elle a toujours les mêmes caractéristiques, peu importe l’objet qui l’invoque"};
        String[] repInc5 = {"Elle n’a rien de spécial","Elle n’a pas le même nombre de paramètres en fonction de l’objet qui l’invoque","Elle n’a pas le même nom en fonction de l’objet qui l’invoque"};
        QCU qc5 = new QCU("Quelle caractéristique principale a une méthode polymorphe ?",repCor5,repInc5);
        String[] repCor6 = {"equals()","toString()","hashCode()"};
        String[] repInc6 = {"wait()","notify()","compareTo()"};
        QCM qc6 = new QCM("Quels sont les méthodes de la classe Object qui sont (très) souvent redénies pour bénécier des avantages du polymorphisme ?",repCor6,repInc6);
        String[] repCor7 = {"Objects","Object","object","objects"};
        QO qc7 = new QO("Quelle nouveauté de Java 7 vous permet de simplier votre redénition des méthodes equals() et hashCode() ?",repCor7);
        String[] repCor8 = {"1"};
        String[] repInc8 = {"2","3","4","5","6"};
        QCU qc8 = new QCU("De combien de classes une classe lle peut-elle hériter ?",repCor8,repInc8);
        String[] repCor9 = {"C’est un endroit où ranger nos classes"};
        String[] repInc9 = {"C’est une classe du langage Java","C’est un conteneur permettant d’exécuter du code Java","C’est une classe du langage Java permettant de créer plusieurs objets à l’intérieur"};
        QCU qc9 = new QCU("Qu’est-ce qu’un package ?",repCor9,repInc9);
        String[] repCor10 = {"Les interfaces dont héritent les collections présentes"};
        String[] repInc10 = {"Rien, ces interfaces n’existent pas","Rien, ce ne sont pas des interfaces mais des classes","Rien, ces interfaces n’ont pas d’implémentation"};
        QCU qc10 = new QCU("Qu’offre Java avec les interfaces java.util.Collection et java.util.Map ?",repCor10,repInc10);
        String[] repCor11 = {"Une classe 100% abstraite permettant de créer un nouveau super type et jouir du polymorphisme"};
        String[] repInc11 = {"Une fenêtre permettant à l’utilisateur d’interagir avec le programme","Une classe abstraite","Une classe présente dans un package du langage Java servant de base à tous les objets du langage"};
        QCU qc11 = new QCU("Dans le langage Java, qu’est-ce qu’une interface ?",repCor11,repInc11);
        List<Question> questions =new ArrayList<Question>();
        questions.add(qc1);
        questions.add(qc2);
        questions.add(qc3);
        questions.add(qc4);
        questions.add(qc5);
        questions.add(qc6);
        questions.add(qc7);
        questions.add(qc8);
        questions.add(qc9);
        questions.add(qc10);
        questions.add(qc11);
        notion.setQuestions(questions);
        return notion;
    }
    public  Notion CreerNotion2(){
        Notion notion = new Notion("Java et la programmation événementielle");
        String[] repCor ={"swing","awt"};
        QO q = new QO("Quels packages avons-nous utilisés pour créer et gérer les interfaces graphiques ?",repCor);
        String[] repCor1 ={"JFrame","JPanel","JButton"};
        String[] repInc1 ={"Button","TableView","SplitPane"};
        QCM q1 = new QCM("Dans le package javax.swing on trouve ?",repCor1,repInc1);
        String[] repCor2 ={"java.awt.event"};
        String[] repInc2 ={"java.swing.event","javax.awt.event","javax.swing.event"};
        QCU q2 = new QCU("Dans quel package trouve-t-on les interfaces permettant d’interagir avec les composants graphiques swing ?",repCor2,repInc2);
        String[] repCor3 ={"Les layouts managers","BorderLayout","GradePane"};
        String[] repInc3 ={"Les objets JPanel","Les panel managers","Les frame managers"};
        QCM q3 = new QCM("Grâce à quels objets pouvez-vous positionner des composants graphiques dans un conteneur de différentes façons ?",repCor3,repInc3);
        String[] repCor4 ={"ActionListener"};
        String[] repInc4 ={"ActionPerformed","ActionEvent","ButtonPerformed","ButtonEvent","ButtonListener"};
        QCU q4 = new QCU("Quelle interface est utilisée pour interagir avec un JButton ?",repCor4,repInc4);
        String[] repCor5 ={"ItemListener"};
        String[] repInc5 ={"ItemPerformed","ItemEvent","ItemState","StateListener","StateEvent"};
        QCU q5 = new QCU("Quelle interface permet de gérer les actions faites sur un objet JComboBox ?",repCor5,repInc5);
        String[] repCor6 ={"Un objet ButtonGroup"};
        String[] repInc6 ={"Un objet ButtonCheck","Un objet ButtonRestrict","Un objet CheckButton","Un objet CheckGroup","Un objet CheckRestrict"};
        QCU q6 = new QCU("Que faut-il rajouter à des objets JRadioButton pour qu’un seul choix ne soit coché lors d’une action de l’utilisateur ?",repCor6,repInc6);
        String[] repCor7 ={"MouseListener"};
        String[] repInc7 ={"MouseEvent","MouseAdapter","MouseCatcher","MouseObserver"};
        QCU q7 = new QCU("Quelle est l’interface qui permet d’interagir avec la souris sur nos composants graphiques ?",repCor7,repInc7);
        String[] repCor8 ={"KeyListener"};
        String[] repInc8 ={"KeyEvent","KeyboardEvent","KeyboardListener"};
        QCU q8 = new QCU("Quelle interface permet de gérer les actions clavier sur certains composants swing ?",repCor8,repInc8);
        String[] repCor9 ={"JMenu","JMenuItem","JCheckBoxMenuItem","JRadioButtonMenuItem"};
        QO q9 = new QO("Quels objets peut-on utiliser dans une JMenuBar ?",repCor9);
        List<Question> questions =new ArrayList<Question>();
        questions.add(q);
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        questions.add(q6);
        questions.add(q7);
        questions.add(q8);
        questions.add(q9);
        notion.setQuestions(questions);
        return notion;
    }
    public  Notion CreerNotion3(){
        Notion notion = new Notion("Interactions avec les bases de données");
        String[] repCor ={"pilote","driver"};
        QO q = new QO("De quoi avez-vous besoin pour permettre à Java de communiquer avec une base de données via JDBC ? ?",repCor);
        String[] repCor1 ={"ResultSet","Statement"};
        String[] repInc1 ={"Result","Set","ResultMap","Map"};
        QCM q1 = new QCM("Quel objets est souvent utilisé pour interroger une base de données avec JDBC ?",repCor1,repInc1);
        String[] repCor2 ={"jdbc:typeDePilote://cheminReseau:portDeDestination/NomDeLaBaseDeDonnées"};
        String[] repInc2 ={"typeDePilote://cheminReseau:portDeDestination/NomDeLaBaseDeDonnées","jdbc:typeDePilote:/NomDeLaBaseDeDonnées//cheminReseau:portDeDestination","typeDePilote:/NomDeLaBaseDeDonnées//cheminReseau:portDeDestination"};
        QCU q2 = new QCU("Quelle forme a l’URL de connexion à une base de données JDBC  ?",repCor2,repInc2);
        String[] repCor3 ={"ResultSet.TYPE_SCROLL_SENSITIVE","ResultSet.CONCUR_UPDATABLE"};
        String[] repInc3 ={"ResultSet.TYPE_SCROLL_INSENSITIVE","ResultSet.CONCUR_READONLY "};
        QCM q3 = new QCM("Comment créer un Statement permettant à l'objet ResultSet de pouvoir être lu d'avant en arrière avec possibilité de modication des données lues, mais aussi mise à jour des données récupérées en cas de modication en base par une autre personne ?",repCor3,repInc3);
        String[] repCor4 ={"1"};
        String[] repInc4 ={"0","2","3","4","5"};
        QCU q4 = new QCU("À quel indice commence le compte des en-têtes de colonnes via l’objet ResultSet ?",repCor4,repInc4);
        String[] repCor5 ={"plus rapides","acceptent des requêtes à trous que vous pouvez manipuler"};
        String[] repInc5 ={"plus simples","Elles n’ont rien de particulier","ce sont d’anciens objets Java"};
        QCM q5 = new QCM("Quels sont les grands intérêts des requêtes préparées ? ?",repCor5,repInc5);
        String[] repCor6 ={"En utilisant le pattern singleton"};
        String[] repInc6 ={"En utilisant un constructeur synchronisé","En utilisant un thread pour créer votre connexion","En vous connectant dans l’EDT"};
        QCU q6 = new QCU("Comment s’assurer que le mécanisme de connexion à une base de données ne s’effectue qu’une seule fois dans un programme  ?",repCor6,repInc6);
        String[] repCor7 ={"En instanciant la connexion depuis la déclaration de votre classe de connexion"};
        String[] repInc7 ={"En instanciant la connexion depuis la méthode main()","En instanciant la connexion depuis un constructeur privé","En instanciant la connexion depuis un objet prévu à cet effet"};
        QCU q7 = new QCU("Qu’est-ce qui permet de s’assurer que la connexion est instanciée au lancement du programme ?",repCor7,repInc7);
        String[] repCor8 ={"À faire une représentation objet de ces tables (et vice-versa)","À faire le lien entre les tables de la base de données"};
        String[] repInc8 ={"À permettre une meilleure performance de votre application","À lire dans votre base de données","À gérer la création d’entrées dans votre base de données"};
        QCM q8 = new QCM("À quoi sert le pattern DAO ?",repCor8,repInc8);
        String[] repCor9 ={"?"};
        QO q9 = new QO("Quel est le caractère que vous devez utiliser dans une requête préparée pour symboliser les futures données que vous allez utiliser ?",repCor9);
        List<Question> questions =new ArrayList<Question>();
        questions.add(q);
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        questions.add(q6);
        questions.add(q7);
        questions.add(q8);
        questions.add(q9);
        notion.setQuestions(questions);
        return notion;
    }
    public Quiz CreerQuiz(){
        Quiz quiz = new Quiz("QuizPersonalisé",LocalDate.of(2019,4,15),LocalDate.of(2019,5,10));
        String[] repCor ={"pilote","driver"};
        QO q = new QO("De quoi avez-vous besoin pour permettre à Java de communiquer avec une base de données via JDBC ? ?",repCor);
        String[] repCor1 ={"ResultSet","Statement"};
        String[] repInc1 ={"Result","Set","ResultMap","Map"};
        QCM q1 = new QCM("Quel objets est souvent utilisé pour interroger une base de données avec JDBC ?",repCor1,repInc1);
        String[] repCor2 ={"jdbc:typeDePilote://cheminReseau:portDeDestination/NomDeLaBaseDeDonnées"};
        String[] repInc2 ={"typeDePilote://cheminReseau:portDeDestination/NomDeLaBaseDeDonnées","jdbc:typeDePilote:/NomDeLaBaseDeDonnées//cheminReseau:portDeDestination","typeDePilote:/NomDeLaBaseDeDonnées//cheminReseau:portDeDestination"};
        QCU q2 = new QCU("Quelle forme a l’URL de connexion à une base de données JDBC  ?",repCor2,repInc2);
        String[] repCor3 ={"ResultSet.TYPE_SCROLL_SENSITIVE","ResultSet.CONCUR_UPDATABLE"};
        String[] repInc3 ={"ResultSet.TYPE_SCROLL_INSENSITIVE","ResultSet.CONCUR_READONLY "};
        QCM q3 = new QCM("Comment créer un Statement permettant à l'objet ResultSet de pouvoir être lu d'avant en arrière avec possibilité de modication des données lues, mais aussi mise à jour des données récupérées en cas de modication en base par une autre personne ?",repCor3,repInc3);
        String[] repCor4 ={"1"};
        String[] repInc4 ={"0","2","3","4","5"};
        QCU q4 = new QCU("À quel indice commence le compte des en-têtes de colonnes via l’objet ResultSet ?",repCor4,repInc4);
        String[] repCor5 ={"plus rapides","acceptent des requêtes à trous que vous pouvez manipuler"};
        String[] repInc5 ={"plus simples","Elles n’ont rien de particulier","ce sont d’anciens objets Java"};
        QCM q5 = new QCM("Quels sont les grands intérêts des requêtes préparées ? ?",repCor5,repInc5);
        String[] repCor6 ={"En utilisant le pattern singleton"};
        String[] repInc6 ={"En utilisant un constructeur synchronisé","En utilisant un thread pour créer votre connexion","En vous connectant dans l’EDT"};
        QCU q6 = new QCU("Comment s’assurer que le mécanisme de connexion à une base de données ne s’effectue qu’une seule fois dans un programme  ?",repCor6,repInc6);
        String[] repCor7 ={"En instanciant la connexion depuis la déclaration de votre classe de connexion"};
        String[] repInc7 ={"En instanciant la connexion depuis la méthode main()","En instanciant la connexion depuis un constructeur privé","En instanciant la connexion depuis un objet prévu à cet effet"};
        QCU q7 = new QCU("Qu’est-ce qui permet de s’assurer que la connexion est instanciée au lancement du programme ?",repCor7,repInc7);
        String[] repCor8 ={"À faire une représentation objet de ces tables (et vice-versa)","À faire le lien entre les tables de la base de données"};
        String[] repInc8 ={"À permettre une meilleure performance de votre application","À lire dans votre base de données","À gérer la création d’entrées dans votre base de données"};
        QCM q8 = new QCM("À quoi sert le pattern DAO ?",repCor8,repInc8);
        String[] repCor9 ={"?"};
        QO q9 = new QO("Quel est le caractère que vous devez utiliser dans une requête préparée pour symboliser les futures données que vous allez utiliser ?",repCor9);
        List<Question> questions =new ArrayList<Question>();
        questions.add(q);
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        questions.add(q6);
        questions.add(q7);
        questions.add(q8);
        questions.add(q9);
        quiz.setQuestions(questions);
        return quiz;
    }
    public ReponseQuiz CreerRep(){

        ReponseQuiz quiz = new ReponseQuiz("QuizPr",LocalDate.of(2019,4,15),LocalDate.of(2019,5,10));
        String[] repCor ={"pilote","driver"};
        QO q = new QO("De quoi avez-vous besoin pour permettre à Java de communiquer avec une base de données via JDBC ? ?",repCor);
        String[] repCor1 ={"ResultSet","Statement"};
        String[] repInc1 ={"Result","Set","ResultMap","Map"};
        QCM q1 = new QCM("Quel objets est souvent utilisé pour interroger une base de données avec JDBC ?",repCor1,repInc1);
        String[] repCor2 ={"jdbc:typeDePilote://cheminReseau:portDeDestination/NomDeLaBaseDeDonnées"};
        String[] repInc2 ={"typeDePilote://cheminReseau:portDeDestination/NomDeLaBaseDeDonnées","jdbc:typeDePilote:/NomDeLaBaseDeDonnées//cheminReseau:portDeDestination","typeDePilote:/NomDeLaBaseDeDonnées//cheminReseau:portDeDestination"};
        QCU q2 = new QCU("Quelle forme a l’URL de connexion à une base de données JDBC  ?",repCor2,repInc2);
        String[] repCor3 ={"ResultSet.TYPE_SCROLL_SENSITIVE","ResultSet.CONCUR_UPDATABLE"};
        String[] repInc3 ={"ResultSet.TYPE_SCROLL_INSENSITIVE","ResultSet.CONCUR_READONLY "};
        QCM q3 = new QCM("Comment créer un Statement permettant à l'objet ResultSet de pouvoir être lu d'avant en arrière avec possibilité de modication des données lues, mais aussi mise à jour des données récupérées en cas de modication en base par une autre personne ?",repCor3,repInc3);
        String[] repCor4 ={"1"};
        String[] repInc4 ={"0","2","3","4","5"};
        QCU q4 = new QCU("À quel indice commence le compte des en-têtes de colonnes via l’objet ResultSet ?",repCor4,repInc4);
        String[] repCor5 ={"plus rapides","acceptent des requêtes à trous que vous pouvez manipuler"};
        String[] repInc5 ={"plus simples","Elles n’ont rien de particulier","ce sont d’anciens objets Java"};
        QCM q5 = new QCM("Quels sont les grands intérêts des requêtes préparées ? ?",repCor5,repInc5);
        String[] repCor6 ={"En utilisant le pattern singleton"};
        String[] repInc6 ={"En utilisant un constructeur synchronisé","En utilisant un thread pour créer votre connexion","En vous connectant dans l’EDT"};
        QCU q6 = new QCU("Comment s’assurer que le mécanisme de connexion à une base de données ne s’effectue qu’une seule fois dans un programme  ?",repCor6,repInc6);
        String[] repCor7 ={"En instanciant la connexion depuis la déclaration de votre classe de connexion"};
        String[] repInc7 ={"En instanciant la connexion depuis la méthode main()","En instanciant la connexion depuis un constructeur privé","En instanciant la connexion depuis un objet prévu à cet effet"};
        QCU q7 = new QCU("Qu’est-ce qui permet de s’assurer que la connexion est instanciée au lancement du programme ?",repCor7,repInc7);
        String[] repCor8 ={"À faire une représentation objet de ces tables (et vice-versa)","À faire le lien entre les tables de la base de données"};
        String[] repInc8 ={"À permettre une meilleure performance de votre application","À lire dans votre base de données","À gérer la création d’entrées dans votre base de données"};
        QCM q8 = new QCM("À quoi sert le pattern DAO ?",repCor8,repInc8);
        String[] repCor9 ={"?"};
        QO q9 = new QO("Quel est le caractère que vous devez utiliser dans une requête préparée pour symboliser les futures données que vous allez utiliser ?",repCor9);
        List<Question> questions =new ArrayList<Question>();
        questions.add(q);
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        questions.add(q6);
        questions.add(q7);
        questions.add(q8);
        questions.add(q9);
        int ind=0;
        List<Reponse> list = new ArrayList<Reponse>();
        for (Question question:questions){
            if(question.getClass().getSimpleName().compareTo("QCU")==0){
                list.add(new ReponseQCU(ind));
            }
            else if(question.getClass().getSimpleName().compareTo("QCM")==0){
                list.add(new ReponseQCM(ind));
            }
            else {
                list.add(new ReponseQO(ind));
            }
            ind++;
        }
        quiz.setReponses(list);
        quiz.setQuestions(questions);
        return quiz;
    }

    public List<Compte> CreerGroupeEtudiant(){
        List<Compte> grp = new ArrayList<Compte>();
        Apprenant cpt1 = new Apprenant("Mostefa","Mourad", LocalDate.of(199,7,13),"Berad3i ,chlef");
        Apprenant cpt2 = new Apprenant("Boudelaa","Zakaria",LocalDate.of(1999,5,19),"El-Ma3moura ,Laghouat");
        Apprenant cpt3 = new Apprenant("Bouali","Dadi",LocalDate.of(1999,11,28),"Chorfa ,Chlef");
        Apprenant cpt4 = new Apprenant("Choudra","Yasser",LocalDate.of(1999,3,15),"Setif z-R");
        grp.add(cpt1);grp.add(cpt3);
        grp.add(cpt2);grp.add(cpt4);
        return grp;
    }

    public Donnee(){
        notions = new ArrayList<Notion>();
        notions.add(CreerNotion1());
        notions.add(CreerNotion2());
        notions.add(CreerNotion3());
        formation = new Formation("Apprendre Java",LocalDate.of(2019,4,14),LocalDate.of(2019,7,20),"Cette Formation est pour les null dans Java et la programmation orionté Objet");
        formation.setContenue(notions);
        formation.setGroupeApprenants(CreerGroupeEtudiant());
        formateurPrincpal = new Compte("Mohammed","Habbi", LocalDate.of(1999,12,12),"Setif z-R and n-R");
        Formateur.setFormation(formation);
        Formateur formateur = new Formateur(formateurPrincpal);
        int ind=0;
        for(int i=0;i<6;i++){
           quizList.add(formateur.genererQuizAuto());
           quizListOuvert1.add(formateur.genererQuizAuto());
            quizListOuvert2.add(formateur.genererQuizAuto());
           List<Reponse> list = new ArrayList<Reponse>();
           ind=0;
            for (Question question:quizListOuvert1.get(i).getQuestions()){
                if(question.getClass().getSimpleName().compareTo("QCU")==0){
                    list.add(new ReponseQCU(ind));
                }
                else if(question.getClass().getSimpleName().compareTo("QCM")==0){
                    list.add(new ReponseQCM(ind));
                }
                else {
                    list.add(new ReponseQO(ind));
                }
                ind++;
            }
            quizListOuvert2.get(i).setReponses(list);
            List<Reponse> list2 = new ArrayList<Reponse>();
            ind=0;
            for (Question question:quizListOuvert2.get(i).getQuestions()){
                if(question.getClass().getSimpleName().compareTo("QCU")==0){
                    list2.add(new ReponseQCU(ind));
                }
                else if(question.getClass().getSimpleName().compareTo("QCM")==0){
                    list2.add(new ReponseQCM(ind));
                }
                else {
                    list2.add(new ReponseQO(ind));
                }
                ind++;
            }
            quizListOuvert2.get(i).setReponses(list2);
            switch (i){
                case 0:
                    quizListOuvert1.get(i).setTauxReussite(85);
                    quizListOuvert1.get(i).setTauxAccopli(100);
                    break;
                case 1:
                    quizListOuvert1.get(i).setTauxReussite(0);
                    quizListOuvert1.get(i).setTauxAccopli(0);
                    break;
                case 2:
                    quizListOuvert1.get(i).setTauxReussite(0);
                    quizListOuvert1.get(i).setTauxAccopli(65);
                    break;
                case 3:
                    quizListOuvert1.get(i).setTauxReussite(76);
                    quizListOuvert1.get(i).setTauxAccopli(100);
                    break;
                case 4:
                    quizListOuvert1.get(i).setTauxReussite(-1);
                    quizListOuvert1.get(i).setTauxAccopli(45);
                    break;
                case 5:
                    quizListOuvert1.get(i).setTauxReussite(-1);
                    quizListOuvert1.get(i).setTauxAccopli(0);
                    break;

            }
            switch (i){
                case 0:
                    quizListOuvert2.get(i).setTauxReussite(75);
                    quizListOuvert1.get(i).setTauxAccopli(90);
                    break;
                case 1:
                    quizListOuvert1.get(i).setTauxReussite(0);
                    quizListOuvert1.get(i).setTauxAccopli(0);
                    break;
                case 2:
                    quizListOuvert1.get(i).setTauxReussite(15);
                    quizListOuvert1.get(i).setTauxAccopli(65);
                    break;
                case 3:
                    quizListOuvert1.get(i).setTauxReussite(16);
                    quizListOuvert1.get(i).setTauxAccopli(100);
                    break;
                case 4:
                    quizListOuvert1.get(i).setTauxReussite(-1);
                    quizListOuvert1.get(i).setTauxAccopli(100);
                    break;
                case 5:
                    quizListOuvert1.get(i).setTauxReussite(-1);
                    quizListOuvert1.get(i).setTauxAccopli(0);
                    break;

            }
        }

    }
}
