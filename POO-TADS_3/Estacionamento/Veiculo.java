package Estacionamento;

public class Veiculo {
    
    private String placa;
    private int odometro;    
    private Cliente proprietario;
    private Categoria categoria;
    

    public Veiculo(String placa, int odometro, Cliente proprietario, Categoria categoria) {
        this.placa = placa;
        this.odometro = odometro;
        this.proprietario = proprietario;
        this.categoria = categoria;
    }

//geter

    public String getPlaca() {
        return placa;
    }

    public int getOdometro() {
        return odometro;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public Categoria getCategoria() {
        return categoria;
    }
//seter 

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setOdometro(int odometro) {
        this.odometro = odometro;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
  
}
