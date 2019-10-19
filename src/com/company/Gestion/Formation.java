package com.company.Gestion;

import com.company.Quiz.Notion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Formation {
    private String nom;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;
    private List<Compte> groupeApprenants = new ArrayList<Compte>();
    private List<Notion> contenue = new ArrayList<Notion>();

    public Formation(String nom, LocalDate dateDebut, LocalDate dateFin, String description) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.description = description;
    }

    public Formation(String nom, LocalDate dateDebut, LocalDate dateFin, String description, List<Compte> groupeApprenants, List<Notion> contenue) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.description = description;
        this.groupeApprenants = groupeApprenants;
        this.contenue = contenue;
    }

    public Formation() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Compte> getGroupeApprenants() {
        return groupeApprenants;
    }

    public void setGroupeApprenants(List<Compte> groupeApprenants) {
        this.groupeApprenants = groupeApprenants;
    }

    public List<Notion> getContenue() {
        return contenue;
    }

    public void setContenue(List<Notion> contenue) {
        this.contenue = contenue;
    }
}

