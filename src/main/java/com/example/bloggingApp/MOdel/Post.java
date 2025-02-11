package com.example.bloggingApp.MOdel;

public class Post {

    private static long idCounter;
    private long id;
    private String categoria;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

    public Post() {
    }

    public Post(long id, String categoria, String cover, String contenuto, int tempoDiLettura) {
        this.id = idCounter++ ;
        this.categoria = categoria;
        this.cover = cover;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
    }
}
