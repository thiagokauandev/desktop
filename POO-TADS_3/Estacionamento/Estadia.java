package Estacionamento;
import java.util.Date;

public class Estadia {
    private Date data;
    private int horaEntrada;
    private int horaSaida;
    private double valorEstadia;
    private Veiculo veiculo;    


public Estadia(Date data, int horaEntrada, int horaSaida, Veiculo veiculo) {
    this.data = data;
    this.horaEntrada = horaEntrada;
    this.horaSaida = horaSaida;
    this.veiculo = veiculo;
    this.valorEstadia = 0;
}

    public void calcularEstadia() {
        int horas = horaSaida - horaEntrada;
        valorEstadia = horas * veiculo.getCategoria().getValorHora();
    }   
    
    //geters
     public Date getData() {
    return data;
    } 
    public int getHoraEntrada() {
    return horaEntrada;
    }
    public int getHoraSaida() {
    return horaSaida;
    }
    public double getValorEstadia() {
    return valorEstadia;
    }
    public Veiculo getVeiculo() {
    return veiculo;     
    }
    //seters
    public void setData(Date data) {
    this.data = data;   
    }
    public void setHoraEntrada(int horaEntrada) {
    this.horaEntrada = horaEntrada;
    }
    public void setHoraSaida(int horaSaida) {
    this.horaSaida = horaSaida;
    }
    public void setValorEstadia(double valorEstadia) {
    this.valorEstadia = valorEstadia;
    }
    
    



}
