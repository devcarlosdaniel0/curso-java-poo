package projetoherança;

public class Aluno extends Pessoa {
    // Atributos
    private int matricula;
    private String curso;
    
    // Métodos
    public void cancelarMatr() {
        System.out.println("Matrícula Cancelada com sucesso!");
    }
    
    // Getters e Setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}