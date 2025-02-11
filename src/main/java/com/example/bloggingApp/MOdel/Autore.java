package com.example.bloggingApp.MOdel;

public class Autore {

    private static long idCounter;
    private long id;
    private String nome;
    private String cognome;
    private String email;
    private String dataDiNascita;
    private String avatar;

    public Autore() {
    }

    public Autore(long id, String nome, String cognome, String email, String dataDiNascita, String avatar) {
        this.id = idCounter++;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.avatar = avatar;
    }
}
