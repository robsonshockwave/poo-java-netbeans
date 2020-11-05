package aula12;

//Polimorfismo 
public class Aula12 {

    public static void main(String[] args) {
        //Animal n = new Animal(); //vai dar erro, pois é classe abstrata
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        a.alimentar();
        a.locomover();
        a.emitirSom();
        
        r.alimentar();
        r.locomover();
        r.emitirSom();
        
        c.locomover();
        k.locomover();
        k.emitirSom();
    }
    
}
