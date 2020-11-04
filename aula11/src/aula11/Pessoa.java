package aula11;

public abstract class Pessoa {
    protected String nome; //coloquei como protected pra na classe aluno poder usar o this.nome ao invés do getNome()
    protected int idade;
    protected String sexo;
    
    public void fazerAniversario() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

    @Override
    public String toString() {
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}
