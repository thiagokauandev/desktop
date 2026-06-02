package Cinema;

public class Filme {
    private String titulo;
    private String diretor;
    private Sala sala;
    

    public Filme(){}

    // Construtor
    public Filme(String titulo, String diretor, Sala sala) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.sala = sala;
    }   
    
    
    // Getters e Setters
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    } 
  

}
