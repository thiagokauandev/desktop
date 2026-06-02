package Estacionamento;

import java.util.Date;
import java.util.Scanner;

public class estacioneAki {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) Criar cliente
        System.out.println("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("CPF: ");
        long cpf = sc.nextLong();
        System.out.println("Celular: ");
        long celular = sc.nextLong();
        sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        Cliente cliente = new Cliente(nome, cpf, celular, email);

        // b) Criar categoria
        System.out.println("Descrição da categoria: ");
        String descricao = sc.nextLine();
        System.out.println("Valor por hora: ");
        double valorHora = sc.nextDouble();
        Categoria categoria = new Categoria(descricao, valorHora);

        // c) Criar veículo
        sc.nextLine();
        System.out.println("Placa do veículo: ");
        String placa = sc.nextLine();
        System.out.println("Odômetro: ");
        int odometro = sc.nextInt();
        Veiculo veiculo = new Veiculo(placa, odometro, cliente, categoria);

        // Registrar estadia
        System.out.println("Hora de entrada (ex: 8): ");
        int entrada = sc.nextInt();
        System.out.println("Hora de saída (ex: 11): ");
        int saida = sc.nextInt();

        Estadia estadia = new Estadia(new Date(), entrada, saida, veiculo);
        estadia.calcularEstadia();

        System.out.printf("Valor a pagar: R$ %.2f%n", estadia.getValorEstadia());

        sc.close();
    }
}