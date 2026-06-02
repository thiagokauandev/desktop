package Loja;

public class Assalariado extends Funcionario {  
    
    private double comissao;
 
    public Assalariado(){
        super();
    }

    public Assalariado(String nome, long cpf, double salario) {
        super(nome, cpf, salario);
    }
    

    //getters
    public double getComissao() {
        return comissao;
    }
    //setters
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    //metodo para calcular

}
