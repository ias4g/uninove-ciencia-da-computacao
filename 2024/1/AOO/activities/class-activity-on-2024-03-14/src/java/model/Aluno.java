package model;

public class Aluno {

    private String nome;
    private float nota1;
    private float nota2;
    private float media;
    private String situacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
        calcMedia();
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
        calcMedia();
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    private void calcMedia(){
        this.media = (this.nota1 + this.nota2) / 2;
        
        this.situacao = this.media < 6 ? "Reprovado" : "Aprovado";
        
        if(media >= 6){
            situacao += ". <b>Parabéns! 😍</b>";
        }else{
            situacao += ", <i>quem sabe um 10 da proxima vez! ☹☹</i>";
        }
    }
    
}
