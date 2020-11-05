package aula12;

public class Mamifero extends Animal {
    private String CorPelo;
    
    @Override
    public void locomover() {
        System.out.println("Corrend");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero"); 
    }

    public String getCorPelo() {
        return CorPelo;
    }

    public void setCorPelo(String CorPelo) {
        this.CorPelo = CorPelo;
    }
    
}
