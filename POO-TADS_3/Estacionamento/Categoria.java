package Estacionamento;

public class Categoria {    

    private String descricao;
    private double valorHora;

    public Categoria(String descricao, double valorHora) {
        this.descricao = descricao;
        this.valorHora = valorHora;
    }

//geter

    public String getDescricao() {
        return descricao;
    }

    public double getValorHora() {
        return valorHora;
    }
//seter

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
}
