package ClassAbstrata;

public class ContaEspecial extends Conta {
    private double limite;


    public ContaEspecial() {
        super();
    }

    public ContaEspecial(int numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou excede o limite.");
        }
    }
    
}
