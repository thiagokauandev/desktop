package EscolaFinal;

public class appEscola {
    public static void main(String[] args) {
        
        //criar um professor, um aluno e uma disciplina
        
        Professor professor1 = new Professor("Dr. Smith", 1234567890L,"smith@gmail.com",12345,"Mathematics");

        Aluno aluno1 = new Aluno("Alice", 9876543210L, "alice@gmail.com", 1245, "Computer Science");
        
        Disciplina disciplina1 = new Disciplina("Calculus", professor1, 60);
    
    
        //exibir informações do professor, aluno e disciplina   
        
        System.out.println("Professor: " + professor1.getNome() + ", Celular: " + professor1.getCelular() + ", Email: " + professor1.getEmail() + ", SIAPE: " + professor1.getSiape() + ", Departamento: " + professor1.getDepartamento());
        System.out.println("Aluno: " + aluno1.getNome() + ", Celular: " + aluno1.getCelular() + ", Email: " + aluno1.getEmail() + ", Matrícula: " + aluno1.getMatricula() + ", Curso: " + aluno1.getCurso());
        System.out.println("Disciplina: " + disciplina1.getNome() + ", Professor: " + disciplina1.getProfessor().getNome() + ", Horas: " + disciplina1.getHoras());
    





    }
}





