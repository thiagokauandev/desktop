package Biblioteca;

import java.util.Scanner;

public class appBiblioteca {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        // Criando os objetos vazios
        Livro novoLivro = new Livro();
        Usuario novoUsuario = new Usuario();

        // Solicitando os dados do Livro
        System.out.println("--- Cadastro de Livro ---");

        System.out.print("Digite o título: ");
        novoLivro.setTitulo(teclado.nextLine());

        System.out.print("Digite o autor: ");
        novoLivro.setAutor(teclado.nextLine());

        System.out.print("Digite o ISBN: ");
        novoLivro.setIsbn(teclado.nextLine());

        System.out.print("Digite o número de páginas: ");
        novoLivro.setPaginas(teclado.nextInt());

        System.out.print("Digite o preço: ");
        novoLivro.setPreco(teclado.nextDouble());

        teclado.nextLine(); // limpa o '\n' que sobra após nextDouble()

        // Solicitando os dados do Usuário
        System.out.println("\n--- Cadastro de Leitor ---");
        System.out.print("Digite o nome: ");
        novoUsuario.setNome(teclado.nextLine());

        // Fechando o scanner
        teclado.close();

        // Exibindo o resultado final
        System.out.println("\nLivro Criado com Sucesso!");
        System.out.println("Título: "  + novoLivro.getTitulo());
        System.out.println("Autor: "   + novoLivro.getAutor());
        System.out.println("ISBN: "    + novoLivro.getIsbn());
        System.out.println("Páginas: " + novoLivro.getPaginas());
        System.out.printf( "Preço: R$ %.2f%n", novoLivro.getPreco());

        System.out.println("\nUsuário Criado com Sucesso!");
        System.out.println("Nome: " + novoUsuario.getNome());
    }
}