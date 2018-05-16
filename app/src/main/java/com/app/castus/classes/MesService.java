package com.app.castus.classes;

public class MesService {

    private String nom;
    private String description;
    private  int thumbnail;

    public MesService() {
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MesService(String nom, String description, int thumbnail) {
        this.nom = nom;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getNom() {

        return nom;
    }

    public String getDescription() {
        return description;
    }

    public int getThumbnail() {
        return thumbnail;
    }
}
