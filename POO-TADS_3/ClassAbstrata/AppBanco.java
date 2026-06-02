package ClassAbstrata;

public class AppBanco {
    public static void main(String[] args) {

        //inicializando as contas

        ContaPoupanca contaPoupanca = new ContaPoupanca(123, "João", 0.05);
        ContaEspecial contaEspecial = new ContaEspecial(456, "Maria", 1000.0);

        //depositar e sacar dinheiro das conta pupanca

        contaPoupanca.depositar(500.0);
        contaPoupanca.sacar(100.0);
        System.out.println("Saldo da conta poupança: R$" + contaPoupanca.saldo);

        //testando o limite da conta especial

        contaEspecial.depositar(2000.0);
        contaEspecial.sacar(2500.0);
        System.out.println("Saldo da conta especial: R$" + contaEspecial.saldo);
        contaEspecial.sacar(1000.0);
        System.out.println("Saldo da conta especial: R$" + contaEspecial.saldo);

    }
}
