package Loja;

public abstract class Funcionario {

    private String nome;
    private long cpf;
    private double salario;

    public Funcionario(){
    }

    public Funcionario(String nome, long cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    //getters

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
    
    
    //setters   

    public void setNome(String nome) {
        this.nome = nome;
    }   
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }



}
