package aula11;
//Herança de diferença
public class Aluno extends Pessoa { //se colocasse final na frente de public essa classe não poderia ter mais um filho/generalização
    private int matricula;
    private String curso;
    public void pagarMensalidade() { //se colocasse final na frente de public esse método não poderia ser sobreposto na classe Bolsista
        System.out.println("Pagando mensalidade do aluno" + this.getNome());
    }

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
