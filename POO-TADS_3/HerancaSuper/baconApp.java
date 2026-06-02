package HerancaSuper;

public class baconApp {
    public static void main(String[] args) {
       
    Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "jaoa@email.com");
    ContaEspecial contaEspecial1 = new ContaEspecial("12345-6", cliente1, 500.0);

//teste de limite da conta especial
    System.out.println("Saldo inicial da conta especial: " + contaEspecial1.getSaldo());
    System.out.println("Limite da conta especial: " + contaEspecial1.getLimite());

    contaEspecial1.sacar(600.0); // Deve ser permitido, pois o saldo + limite é suficiente
    System.out.println("Saldo após saque de 600: " + contaEspecial1.getSaldo());

    contaEspecial1.sacar(200.0); // Deve ser permitido, pois o saldo + limite é suficiente
    System.out.println("Saldo após saque de 200: " + contaEspecial1.getSaldo());

    contaEspecial1.sacar(100.0); // Deve ser negado, pois o saldo + limite não é suficiente
    System.out.println("Saldo após tentativa de saque de 100: " + contaEspecial1.getSaldo());

//teste de deposito
    contaEspecial1.depositar(300.0);
    System.out.println("Saldo após depósito de 300: " + contaEspecial1.getSaldo());

// movimentar
    contaEspecial1.movimentar(100.0, contaEspecial1.SACAR);
    System.out.println("Saldo após movimentação de saque de 100: " + contaEspecial1.getSaldo());

    contaEspecial1.movimentar(200.0, contaEspecial1.DEPOSITAR);
    System.out.println("Saldo após movimentação de depósito de 200: " + contaEspecial1.getSaldo());

    contaEspecial1.movimentar(50.0, 3); // Tipo inválido
}

}