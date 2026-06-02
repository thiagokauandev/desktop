import java.util.Scanner;
class Atleta{
    String nome;
    int idade;
    float altura;
    float peso;

    int tempoAposentadoria(int idade){
    if(idade >= 40)
    {
        return 0;
    }
    else{
        return  40 - idade;
    }
    }
   int podeAposentar(int idade) {
    if (idade >= 40) {
        return 1; 
    } else {
        return 0; 
    }
}
}

public class appAtleta{
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    Atleta atleta = new Atleta();
    
    System.out.print("Digite o nome do atleta: ");
    atleta.nome = teclado.nextLine();

    System.out.print("Digite a idade do atleta: ");
    atleta.idade = teclado.nextInt();

    System.out.print("Digite a altura do atleta: ");
    atleta.altura = teclado.nextFloat();

    System.out.print("Digite o peso do atleta: ");
    atleta.peso = teclado.nextFloat();
    
    teclado.close();

    System.out.println("-------Dados do atleta----------");

    System.out.println("*Nome: " + atleta.nome);
    System.out.println("*Idade: " + atleta.idade);
    System.out.println("*Altura: " + atleta.altura);
    System.out.println("*Peso: " + atleta.peso);
    
    System.out.println("-------Tempo para aposentadoria----------");

    int tempo = atleta.tempoAposentadoria(atleta.idade);
   
    System.out.println("Faltam " + tempo + " anos para aposentadoria.");

    System.out.println("--------Aposentar--------");

   int resultado = atleta.podeAposentar(atleta.idade);
    
    if(resultado == 1){
    System.out.println("Pode aposentar");
    }
    else{
    System.out.println("Não pode aposentar");
    }
    }
    }