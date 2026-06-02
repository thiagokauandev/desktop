package Banco;

public class AppBancario {
public static void main(String[] args) {
Pessoa pessoa;
Conta conta;


// Iniciando os objetos pessoa e conta, e atribuindo valores aos atributos de cada um.
pessoa = new Pessoa();

pessoa.setNome("Ciclano");
pessoa.setEmail("ciclano@gmail.com");
pessoa.setCelular(99873452);


// Iniciando o objeto conta, e atribuindo valores aos atributos de cada um.

conta = new Conta(109856, pessoa, 250.89f);

System.out.println("Numero: " + conta.getNumero());
System.out.println("Correntista: " + conta.getCorrentista().getNome());
System.out.println("Saldo: " + conta.getSaldo());

//deposito
conta.depositar(100.00f);
System.out.println("Saldo após depósito: " + conta.getSaldo());

//saque
boolean saqueRealizado = conta.sacar(50.00f);
if (saqueRealizado) {
    System.out.println("Saque realizado com sucesso.");
} else {
    System.out.println("Saque não realizado. Saldo insuficiente.");
}
}
}
