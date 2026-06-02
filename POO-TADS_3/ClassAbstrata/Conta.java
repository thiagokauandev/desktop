package ClassAbstrata;

public abstract class Conta {
    protected int numero;
    protected double saldo;
    protected String titular;


public Conta(){};

public Conta(int numero, String titular) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = 0.0;
}

//seters
public void setNumero(int numero) {
    this.numero = numero;
}   
public void setTitular(String titular) {
    this.titular = titular;
}
//geters

public int getNumero() {
    return numero;  
}   
public String getTitular() {
    return titular;
}

//metodos
public void depositar(double valor) {
    if (valor > 0) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    } else {
        System.out.println("Valor de depósito inválido.");
    }
}
public abstract void sacar(double valor);
}