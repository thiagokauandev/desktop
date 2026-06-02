package Imposto;

public class PessoaJuridica extends Pessoa {
    private long cnpj;
    private String razaoSocial;


//construtor   
   

    public PessoaJuridica(long cnpj, String razaoSocial) {
        super();
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        
    }

    public PessoaJuridica(String nome, String email, long celular, long cnpj, String razaoSocial) {
        super(nome, email, celular);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }


//geter
    public long getCnpj() {
        return cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }


//seter
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }   
    public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    }

//metodo calcular imposto com 10% de imposto para pessoa juridica
    @Override
    public double calcularImposto() {
        return super.calcularImposto() * 0.10; // Exemplo de cálculo de imposto para pessoa jurídica
    }
}
