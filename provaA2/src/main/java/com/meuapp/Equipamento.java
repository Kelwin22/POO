package com.meuapp;

public class Equipamento {
    private int id;
    private String nome;
    private String modelo;
    private int idadeMes;
    private int usuarioId;

    // Construtor
    public Equipamento(int id, String nome, String modelo, int idadeMes, int usuarioId) {
        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.idadeMes = idadeMes;
        this.usuarioId = usuarioId;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdadeMes() {
        return idadeMes;
    }

    public void setIdadeMes(int idadeMes) {
        this.idadeMes = idadeMes;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}
