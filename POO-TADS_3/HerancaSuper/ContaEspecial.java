package HerancaSuper;

public final class ContaEspecial extends Conta {
    
    private double limite;


    public ContaEspecial() {
        super();
    }

    public ContaEspecial(String numero, Cliente cliente, double limite) {
        super(numero, 0.00, cliente);
        this.limite = limite;
    }

//getters e setters

    public final double getLimite() {
        return limite;
    }

    public final void setLimite(double limite) {
        this.limite = limite;
    }

//sobrescreve o metodo sacar(polimorfismo) para considerar o limite
    @Override
    public final void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo + this.limite) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor de saque inválido ou saldo + limite insuficiente.");
        }
    }
    
}
	