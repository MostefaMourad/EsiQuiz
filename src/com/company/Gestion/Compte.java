package com.company.Gestion;

import java.time.LocalDate;

public class Compte {
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String Adresse;
    private String Login;
    private String motDePasse;

    public Compte(String nom, String prenom, LocalDate dateDeNaissance, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        Adresse = adresse;
        this.Login=genererLogin();
        this.motDePasse=genererMDP();
    }

    public Compte() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String genererLogin(){
           String str="";
           str=this.prenom.charAt(0)+this.nom;
           return str;
    }
    public String genererMDP(){
        String str="";
        str=this.nom+this.dateDeNaissance.toString();
        return str;
    }

    @Override
    public String toString() {
        String str;
        str="\t-Nom :"+this.nom +"\n";
        str+="\t-Prénom :"+this.prenom+"\n";
        str+="\t-Date de Naissance :"+this.dateDeNaissance.toString()+"\n";
        str+="\t-Adresse :"+this.Adresse+"\n"+"\n";
        return str;
    }
}
