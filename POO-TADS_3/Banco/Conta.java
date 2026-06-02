package Banco;

class Conta {
// Atributos da classe Conta.
private int numero;
private Pessoa correntista;
private float saldo;

public Conta() {}

// Construtor da classe Conta.

public Conta(int numero, Pessoa correntista, float saldo) {
    this.numero = numero;
    this.correntista = correntista;
    this.saldo = 0.00f;
}   


// getters e setters da classe Conta menos saldo, pois o saldo só pode ser alterado por meio de métodos específicos para isso, como depósito e saque.


//numero
public int getNumero() {
    return numero;
}
public void setNumero(int numero) {
    this.numero = numero;
}

// correntista
public Pessoa getCorrentista() {
    return correntista;
}
public void setCorrentista(Pessoa correntista) {
    this.correntista = correntista;
}

//depósito
public void depositar(float valor) {
    this.saldo += valor;
}
//saque
public boolean sacar(float valor) {
    if (this.saldo >= valor) {
        this.saldo -= valor;
        return true;
    } else {
        return false;
    }
}

public String getSaldo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSaldo'");
}
}
