package interface_funcionario;

import java.util.Scanner;

public class appLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        long cpf = scanner.nextLong();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Comissão: ");
        double comissao = scanner.nextDouble();

        Assalariado assalariado = new Assalariado(nome, cpf, salario, comissao);

        float taxaInss = 0.11f;        // 11% de desconto do INSS
        float percentualAumento = 0.05f; // 5% de aumento salarial

        float salarioComDesconto = assalariado.descontarInss(taxaInss);
        System.out.printf("Salário após desconto INSS (%.0f%%): R$ %.2f%n",
                taxaInss * 100, salarioComDesconto);

        float salarioComAumento = assalariado.calcularAumento(percentualAumento);
        System.out.printf("Salário após aumento (%.0f%%): R$ %.2f%n",
                percentualAumento * 100, salarioComAumento);

        scanner.close();
    }
}