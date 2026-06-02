package EscolaFinal;

public class Disciplina {
    private String nome;;
    private Professor professor;
    private int horas;

    public Disciplina() {
    }

    public Disciplina(String nome, Professor professor, int horas) {
        this.nome = nome;
        this.professor = professor;
        this.horas = horas;
    }
    
    //getters
    
    public final String getNome() {
        return nome;   
    }
    public final Professor getProfessor() {
        return professor;
    }
    public final int getHoras() {
        return horas;
    }

    //setters

    public final void setNome(String nome) {
        this.nome = nome;
    }
    public final void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public final void setHoras(int horas) {
        this.horas = horas;
    }
}
