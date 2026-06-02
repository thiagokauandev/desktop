package Imposto;

public class PessoaFisica extends Pessoa {
    private long cpf;

//construtor

    public PessoaFisica(long cpf) {
        super();
        this.cpf = cpf;
    }
    
    public PessoaFisica(String nome, String email, long celular, long cpf) {
        super(nome, email, celular);
        this.cpf = cpf;
    }


//geter
    public long getCpf() {
        return cpf;
    }

//seter
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }       

//metodo calcular imposto com 15% de imposto para pessoa fisica

    @Override
    public double calcularImposto() {
        return super.calcularImposto() * 0.15; // Exemplo de cálculo de imposto para pessoa física
    }

    
}
