package aula12;

public class Tartaruga extends Reptil{
    
    @Override
    public void locomover(){
        System.out.println("Andannndo beeeem devagaaaaar");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo folhas");
    }
    
    public void esconder(){
        System.out.println("Encondendo no interior do casco");
    }
}
