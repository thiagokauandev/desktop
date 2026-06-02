package interface_funcionario;

public class Assalariado extends Funcionario implements Encargos {
    private double comissao; 

    public Assalariado() {
        super();
    }

    public Assalariado(String nome, long cpf, double salario, double comissao) {
        super(nome, cpf, salario);
        this.comissao = comissao;
    }

    // getters
    public double getComissao() {
        return comissao;
    }

    // setters
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // métodos da interface Encargos
    @Override
    public float descontarInss(float taxa) {
        return (float) (getSalario() * (1 - taxa));
    }

    @Override
    public float calcularAumento(float percentual) {
        return (float) (getSalario() * (1 + percentual));
    }

    // método da própria classe
    public void calcularComissao(float percentual, double totalVendas) {
        this.comissao = percentual * totalVendas;
    }
}