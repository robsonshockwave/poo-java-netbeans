package aula12;

public class Canguru extends Mamifero {
    
    public void usarBolsa(){
        System.out.println("O filhote está na bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
}
