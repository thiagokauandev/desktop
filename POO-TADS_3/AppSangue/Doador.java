package AppSangue;


// Atributos privados — acesso externo bloqueado
public class Doador {
private String nome;
private int idade;
private double peso;
private boolean podeDoar; // Calculado automaticamente



public Doador( ){ }


//Um construtor para inicializar.

public Doador(String nome, int idade, double peso) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.verificarAptidao();
}

// teste do podeDoar

private void verificarAptidao() {
    if(this.idade >= 18 && this.idade <= 69 && this.peso >= 50.0){
     this.podeDoar=true;
    }else{
     this.podeDoar=false;
    }

}

// Getters — leitura permitida para todos

public String getNome() {
    return this.nome;
}
public int getIdade() {
    return idade;
}
public double getPeso() {
    return peso;
}
public boolean isPodeDoar() {
    return podeDoar;
}




//metodos de acesso set para os atributos

public void setNome(String nome){
this.nome =nome;
}

public void setIdade(int idade) {

this.idade = idade;
this.verificarAptidao(); // Revalida após a mudança
}

public void setPeso(double peso) {
this.peso = peso;
this.verificarAptidao(); // Revalida após a mudança
}
public void setPodeDoar(boolean podeDoar) {
    this.podeDoar = podeDoar;
}
}