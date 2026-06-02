package EscolaFinal;

public final class Professor extends Pessoa {
    private int siape;
    private String departamento;


    public Professor() {
        super();
    }

    public Professor(String nome, Long celular, String email, int siape, String departamento) {
        super(nome, celular, email);
        this.siape = siape;
        this.departamento = departamento;
    }

    //getters
    public final int getSiape() {
        return siape;
    }
    public final String getDepartamento() {
        return departamento;
    }

    //setters
    public final void setSiape(int siape) {
        this.siape = siape;
    }
    public final void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


}
