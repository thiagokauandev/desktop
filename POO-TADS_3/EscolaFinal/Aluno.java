package EscolaFinal;

public final class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    public final int ANO = 2025;

    public Aluno() {
        super();
    }

    public Aluno(String nome, Long celular, String email, int matricula, String curso) {
        super(nome, celular, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    //getters
    public final int getMatricula() {
        return matricula;
    }
    public final String getCurso() {
        return curso;
    }

    //setters
    public final void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public final void setCurso(String curso) {
        this.curso = curso;
    }


    
}
