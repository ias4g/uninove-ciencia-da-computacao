package model.bean;

public class Cliente extends Pessoa {

    private String tipo;
    private float valorUltimaVenda;
    private String cep;
    
    public Cliente() {
        this.tipo = "Cliente";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValorUltimaVenda() {
        return valorUltimaVenda;
    }

    public void setValorUltimaVenda(float valorUltimaVenda) {
        this.valorUltimaVenda = valorUltimaVenda;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
