package Estacionamento;

public class Cliente {

    private String nome;
    private long cpf;
    private Long celular;
    private String email;

    public Cliente(String nome, long cpf, Long celular, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
    }

// geter 

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public Long getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

// seter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
