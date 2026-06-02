package EmpreFunc;

public class Funcionario {
    private String nome;
    private String email;
    private long celular;
    private Setor setor;
    private double salario;

    public Funcionario() { }

    //getters e setters da classe Funcionario.

    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //celular
    public long getCelular() {
        return celular;
    }
    public void setCelular(long celular) {
        this.celular = celular;
    }

    //setor
    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    //salário
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * percentual / 100;
    }
}
