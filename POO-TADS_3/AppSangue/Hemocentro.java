package AppSangue;

public class Hemocentro {
    public static void main(String[] args) {
    
    // criar um objeto do tipo Doador

    Doador doadorA = new Doador("thiago kauan", 20, 65.0);

    // mostrar A os dados do produto no terminal

    System.out.println("=== Doador A ===");
    System.out.println("Nome: " + doadorA.getNome());
    System.out.println("Idade: " + doadorA.getIdade());
    System.out.println("Peso: " + doadorA.getPeso() + "kg");
    System.out.println("Pode doar? " + doadorA.isPodeDoar()); // true

    
    System.out.println();
   
   Doador doadorB = new Doador("Bruno Costa", 17, 60.0);
    System.out.println("=== Doador B (antes) ===");
    System.out.println("Nome: " + doadorB.getNome());
    System.out.println("Idade: " + doadorB.getIdade());
    System.out.println("Pode doar? " + doadorB.isPodeDoar()); // false


    System.out.println();   
   
   // Atualizar os dados do doador B para torná-lo apto a doar
    System.out.println("Atualizando idade do Doador B para 19...");
    doadorB.setIdade(19);

    System.out.println("=== Doador B (após setIdade(19)) ===");
    System.out.println("Idade: " + doadorB.getIdade());
    System.out.println("Pode doar? " + doadorB.isPodeDoar()); // true
   

    }
}
