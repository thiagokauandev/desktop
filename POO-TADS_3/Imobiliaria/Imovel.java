package Imobiliaria;

public abstract class Imovel {
    private Pessoa proprietario;
    private float area;
    private String tipo;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    // Construtor padrão
    public Imovel() {}

    // Construtor sobrecarregado: proprietário, área e tipo
    public Imovel(Pessoa proprietario, float area, String tipo) {
        this.proprietario = proprietario;
        this.area = area;
        this.tipo = tipo;
    }

    // Construtor sobrecarregado: proprietário, área, tipo e cidade
    public Imovel(Pessoa proprietario, float area, String tipo, String cidade) {
        this(proprietario, area, tipo);
        this.cidade = cidade;
    }

    // Construtor sobrecarregado completo
    public Imovel(Pessoa proprietario, float area, String tipo, String endereco, int numero, String complemento, String bairro, String cidade, String estado) {
        this.proprietario = proprietario;
        this.area = area;
        this.tipo = tipo;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Método abstrato
    public abstract float calcularIPTU(float fator);

    // Getters e Setters
    public Pessoa getProprietario() { return proprietario; }
    public void setProprietario(Pessoa proprietario) { this.proprietario = proprietario; }

    public float getArea() { return area; }
    public void setArea(float area) { this.area = area; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}