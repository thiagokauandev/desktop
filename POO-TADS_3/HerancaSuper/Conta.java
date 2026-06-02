package HerancaSuper;

public abstract class Conta {    

    private String numero;
    protected double saldo;
    private Cliente cliente;  
    public final int SACAR = 1;
    public final int DEPOSITAR = 2;  

    public Conta() {
    }

    public Conta(String numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = 0.00; // O saldo inicial é definido como 0, independentemente do valor passado
        this.cliente = cliente;
    }

//setters

    public final void setNumero(String numero) {
        this.numero = numero;
    }

    public final void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public final void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
//getters

    public final String getNumero() {
        return numero;
    }

    public final double getSaldo() {
        return saldo;
    }

    public final Cliente getCliente() {
        return cliente;
    }

//metodos deposita e sacar

    public final void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public abstract void sacar(double valor);

    public final void movimentar(double valor, int tipo) {
        if (tipo == SACAR) {
            sacar(valor);
        } else if (tipo == DEPOSITAR) {
            depositar(valor);
        } else {
            System.out.println("Tipo de movimentação inválido.");
        }
    }
}

