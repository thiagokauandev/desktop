package EmpreFunc;

public class AppEmpresa {
    public static void main(String[] args) {
        // Criando setores
        Setor setor1 = new Setor();
        setor1.setNome("Recursos Humanos");

        Setor setor2 = new Setor();
        setor2.setNome("Tecnologia da Informação");

        // Criando funcionários
        Funcionario func1 = new Funcionario();
        func1.setNome("Alice");
        func1.setEmail("alice@gmail.com");
        func1.setCelular(99873452);
        func1.setSetor(setor1);

        Funcionario func2 = new Funcionario();
        func2.setNome("Bob");
        func2.setEmail("bob@gmail.com");
        func2.setCelular(99873453);
        func2.setSetor(setor2);


        // Exibindo informações dos funcionários

        //funcionário 1

        System.out.println("Funcionário: " + func1.getNome());
        System.out.println("Email: " + func1.getEmail());
        System.out.println("Celular: " + func1.getCelular());
        System.out.println("Setor: " + func1.getSetor().getNome()); 
        System.out.println("Salário: " + func1.getSalario());
        System.out.println();   

        //funcionário 2

        System.out.println("Funcionário: " + func2.getNome());
        System.out.println("Email: " + func2.getEmail());
        System.out.println("Celular: " + func2.getCelular());   
        System.out.println("Setor: " + func2.getSetor().getNome());
        System.out.println("Salário: " + func2.getSalario());
        System.out.println();

        // Aumentando o salário do funcionário 1 em 10%

        func1.aumentarSalario(10);
        System.out.println("Salário de " + func1.getNome() + " após aumento: " + func1.getSalario());
    }

}
