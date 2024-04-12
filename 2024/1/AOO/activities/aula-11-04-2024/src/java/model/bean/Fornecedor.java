package model.bean;

public class Fornecedor extends Pessoa {

    private String tipo;
    private float valorUltimaCompra;

    public Fornecedor() {
        this.tipo = "Fornecedor";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValorUltimaCompra() {
        return valorUltimaCompra;
    }

    public void setValorUltimaCompra(float valorUltimaCompra) {
        this.valorUltimaCompra = valorUltimaCompra;
    }

}
