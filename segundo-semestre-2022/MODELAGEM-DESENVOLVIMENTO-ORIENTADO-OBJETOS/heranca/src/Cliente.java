
public class Cliente extends Pessoa {

    private String dataPrimeiroCompra;
    private String cupomDesconto;

    public Cliente(String dataPrimeiroCompra, String cupomDesconto, int id, String nome, String endereco, String telefone, String email) {
        super(id, nome, endereco, telefone, email);
        this.dataPrimeiroCompra = dataPrimeiroCompra;
        this.cupomDesconto = cupomDesconto;
    }

    public String getDataPrimeiroCompra() {
        return dataPrimeiroCompra;
    }

    public void setDataPrimeiroCompra(String dataPrimeiroCompra) {
        this.dataPrimeiroCompra = dataPrimeiroCompra;
    }

    public String getCupomDesconto() {
        return cupomDesconto;
    }

    public void setCupomDesconto(String cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }

}
