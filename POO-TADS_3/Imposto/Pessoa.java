package Imposto;

public class Pessoa {
    private String nome;
    private String email;
    private long celular;
    private double valor;
    public Pessoa() {
    }

    public Pessoa(String nome, String email, long celular) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.valor = 0.0;
    }

//geter

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public long getCelular() {
        return celular; 
    }
    public double getValor() {
        return valor;
    }

//seter


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCelular(long celular) {
        this.celular = celular;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

//metodo calcular imposto
    
    public double calcularImposto() {
        return valor; // Retorna o valor para ser calculado nas subclasses
    }
}

