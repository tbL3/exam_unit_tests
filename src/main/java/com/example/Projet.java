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

    public void supprimerTache(String titre){

        Tache tacheASupprimer = null;

        for(Tache tache : taches){
            if(tache.titre.equals(titre)){
                tacheASupprimer = tache;
            }
        }

        if(tacheASupprimer != null){
            taches.remove(tacheASupprimer);
        }
    }

    public int calculerDureeTotale(){
        
        int counter = 0;
        
        for(Tache tache : taches){
            if(tache.duree >= 0){
                counter += tache.duree;
            }
        }

        return counter;
    }
}
