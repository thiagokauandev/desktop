package EscolaFinal;

public abstract class Pessoa {

    private String nome;
    private Long celular;
    private String email;

    public Pessoa() {
    }
    public Pessoa(String nome, Long celular, String email) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
    }

    //getters

    public final String getNome() {
        return nome;
    }

    public final Long getCelular() {
        return celular;
    }
    public final String getEmail() {
        return email;
    }

    //setters
    
    public final void setNome(String nome) {
        this.nome = nome;
    }
    public final void setCelular(Long celular) {
        this.celular = celular;
    }
    public final void setEmail(String email) {
        this.email = email;
    }


}
