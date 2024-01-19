package com.example;

public class TachesController {
    
    public Projet projet;

    public TachesController(String nom){
        this.projet = new Projet(nom);
    }

    @Override
    public String toString(){
        String str = "";
        str += "Liste des taches :\n";
        for(Tache tache : projet.taches){
            str += String.format("- Titre : %s ; description : %s ; durée : %d\n", tache.titre, tache.desc, tache.duree);
        }

        return str;
    }
}
