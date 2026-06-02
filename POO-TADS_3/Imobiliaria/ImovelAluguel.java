package Imobiliaria;

public final class ImovelAluguel extends Imovel {
    private String modalidade;
    private float caucao;
    private float valorAluguel;

    // Construtor padrão
    public ImovelAluguel() {}

    // Construtor sobrecarregado completo
    public ImovelAluguel(Pessoa proprietario, float area, String tipo, String endereco, int numero, String complemento, String bairro, String cidade,
                         String estado, String modalidade, float caucao, float valorAluguel) {
        super(proprietario, area, tipo, endereco, numero, complemento, bairro, cidade, estado);
        this.modalidade = modalidade;
        this.caucao = caucao;
        this.valorAluguel = valorAluguel;
    }

    // calcularIPTU: fator * área
    @Override
    public float calcularIPTU(float fator) {
        return fator * getArea();
    }

    // calcularTaxas
    public float calcularTaxas(float iptu, float agua, float condominio) {
        return iptu + agua + condominio;
    }

    // Getters e Setters
    public String getModalidade() { return modalidade; }
    public void setModalidade(String modalidade) { this.modalidade = modalidade; }

    public float getCaucao() { return caucao; }
    public void setCaucao(float caucao) { this.caucao = caucao; }

    public float getValorAluguel() { return valorAluguel; }
    public void setValorAluguel(float valorAluguel) { this.valorAluguel = valorAluguel; }
}