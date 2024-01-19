package com.example;

public class Tache {
    
    public String titre, desc;
    public boolean isCompleted = false;
    public int duree;

    public Tache(String titre, String desc, int duree){
        this.titre = titre;
        this.desc = desc;
        this.duree = duree;
    }
}
