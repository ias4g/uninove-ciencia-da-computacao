package edu.uni9.mdoo.heranca.models;

public class Funcionario extends Pessoa {

    private String cargo;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(String cargo, Double salario, int id, String nome, String endereco, String telefone, String email) {
        super(id, nome, endereco, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
