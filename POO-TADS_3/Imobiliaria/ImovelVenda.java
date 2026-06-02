package Imobiliaria;

public final class ImovelVenda extends Imovel {
    
    private float valorVenda;
    private float valorDesconto;
    private float prazoFinanciamento;

    // Construtor padrão
    public ImovelVenda() {}

    // Construtor sobrecarregado completo
    public ImovelVenda(Pessoa proprietario, float area, String tipo, String endereco,
                       int numero, String complemento, String bairro, String cidade,
                       String estado, float valorVenda, float valorDesconto, float prazoFinanciamento) {
        super(proprietario, area, tipo, endereco, numero, complemento, bairro, cidade, estado);
        this.valorVenda = valorVenda;
        this.valorDesconto = valorDesconto;
        this.prazoFinanciamento = prazoFinanciamento;
    }

    // calcularIPTU: fator * área + 5% do valor de venda
    @Override
    public float calcularIPTU(float fator) {
        return (fator * getArea()) + (0.05f * valorVenda);
    }

    // calcularVenda: valorVenda - valorDesconto
    public float calcularVenda() {
        return valorVenda - valorDesconto;
    }

    // calcularITBI: aplica a taxa sobre o valorVenda
    public float calcularITBI(float taxa) {
        return valorVenda * taxa;
    }

    // Getters e Setters
    public float getValorVenda() { return valorVenda; }
    public void setValorVenda(float valorVenda) { this.valorVenda = valorVenda; }

    public float getValorDesconto() { return valorDesconto; }
    public void setValorDesconto(float valorDesconto) { this.valorDesconto = valorDesconto; }

    public float getPrazoFinanciamento() { return prazoFinanciamento; }
    public void setPrazoFinanciamento(float prazoFinanciamento) { this.prazoFinanciamento = prazoFinanciamento; }
}