package Imposto;

public class impostoRenda {
    public static void main(String[] args) {

//criando pessoa fisica

        PessoaFisica pessoaFisica = new PessoaFisica(123456789L);
        pessoaFisica.setNome("João");
        pessoaFisica.setEmail("jaoa@gamil.com");
        pessoaFisica.setCelular(987654321L);

//criando pessoa juridica

        PessoaJuridica pessoaJuridica = new PessoaJuridica(987654321L, "Empresa XYZ");
        pessoaJuridica.setNome("Empresa XYZ");
        pessoaJuridica.setEmail("empresa@xyz.com");
        pessoaJuridica.setCelular(987654321L);

//calculando imposto para pessoa fisica com valor de 30.0000

        pessoaFisica.setValor(30000.0);
        double impostoPessoaFisica = pessoaFisica.calcularImposto();
        System.out.println("Imposto para Pessoa Física: " + impostoPessoaFisica);
        
//calculando imposto para pessoa juridica com valor de 30.0000

        pessoaJuridica.setValor(30000.0);
        double impostoPessoaJuridica = pessoaJuridica.calcularImposto();
        System.out.println("Imposto para Pessoa Jurídica: " + impostoPessoaJuridica);
    }
}
