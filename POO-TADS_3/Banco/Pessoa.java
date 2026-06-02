package Banco;

public class Pessoa {
private String nome;
private String email;
private long celular;
public Pessoa(){ }


//geters e setters da classe Pessoa.

//nome
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}

//email
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}

//celular
public long getCelular() {
    return celular;
}
public void setCelular(long celular) {
    this.celular = celular;
}
}