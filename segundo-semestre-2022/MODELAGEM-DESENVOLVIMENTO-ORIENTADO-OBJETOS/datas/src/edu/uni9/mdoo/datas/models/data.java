package edu.uni9.mdoo.datas.models;

import java.util.Date;

public class Data {

    private int id;
    private String nome;
    private Date data;

    public Data() {
    }

    public Data(int id, String nome, Date data) {
        this.id = id;
        this.nome = nome;
        this.data = data;
    }

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
