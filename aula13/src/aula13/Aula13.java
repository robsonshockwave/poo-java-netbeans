package aula13;

// Polimorfismo Sobrecarga
public class Aula13 {

    public static void main(String[] args) {
        // Programa principal
        Cachorro c = new Cachorro();
        c.emitirSom();
        
        c.reagir("Olá");
        c.reagir(11,45);
        c.reagir(false);
    }
    
}
