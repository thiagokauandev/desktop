package Cinema;

public class AppCinema {

    public static void main(String[] args) {

        Sala sala1 = new Sala();
        
        sala1.setNome("VIP");
        sala1.setNumero(1); 


        Filme filme1 = new Filme();

        filme1.setTitulo("O Poderoso Chefão");
        filme1.setDiretor("Francis Ford Coppola");
        filme1.setSala(sala1);

        System.out.println("Filme: " + filme1.getTitulo());
        System.out.println("Diretor: " + filme1.getDiretor());
        System.out.println("tipo de Sala: " + filme1.getSala().getNome());
        System.out.println("Sala: " + filme1.getSala().getNumero());
        
        
       
    }
}
