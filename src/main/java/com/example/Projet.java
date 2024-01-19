package com.example;

import java.util.List;

public class Projet {
    
    public String nom;
    public GestionTaches gestionTaches;

    public List<Tache> taches;

    public Projet(String nom){
        this.nom = nom;
        this.gestionTaches = new GestionTaches();
        taches = gestionTaches.taches;
    }

    public void ajouterTache(String titre, String desc, int duree){
        this.gestionTaches.ajouterTache(titre, desc, duree);
    }
}
