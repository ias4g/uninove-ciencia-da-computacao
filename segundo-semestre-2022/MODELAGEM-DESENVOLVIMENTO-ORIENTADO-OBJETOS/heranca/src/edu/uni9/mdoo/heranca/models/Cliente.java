package edu.uni9.mdoo.heranca.models;

public class Cliente extends Pessoa {

    private String dataCompra;
    private String cupomDesconto;

    public Cliente() {
    }

    public Cliente(String dataCompra, String cupomDesconto, int id, String nome, String endereco, String telefone, String email) {
        super(id, nome, endereco, telefone, email);
        this.dataCompra = dataCompra;
        this.cupomDesconto = cupomDesconto;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getCupomDesconto() {
        return cupomDesconto;
    }

    public void setCupomDesconto(String cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }

}
