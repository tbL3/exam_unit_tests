package com.example;

import java.util.*;

public class GestionTaches {
    
    public List<Tache> taches = new ArrayList<>();

    public void ajouterTache(String titre, String desc){
        this.taches.add(new Tache(titre, desc));
    }

    public boolean completerTache(String titre){
        for(Tache tache : taches){
            if(tache.titre.equals(titre)){
                tache.isCompleted = true;
                return tache.isCompleted;
            }
        }

        return false;
    }

    public String verifierTache(String titre){
        for(Tache tache : taches){
            if(tache.titre.equals(titre)){
                return String.valueOf(tache.isCompleted);
            }
        }

        return "La tache n'existe pas";
    }
}
