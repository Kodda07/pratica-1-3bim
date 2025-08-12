
package programdependencia.model;

public class Funcionario {
    private int cod;
    private String nome;
    private double salario;

    public Funcionario(int cod, String nome, double salario) {
        this.cod = cod;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cod=" + cod + ", nome=" + nome + ", salario=" + salario + '}';
    }
    
}
