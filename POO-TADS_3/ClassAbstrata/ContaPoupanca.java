package ClassAbstrata;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int numero, String titular, double taxaJuros) {
        super(numero, titular);
        this.taxaJuros = taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }
    
}
