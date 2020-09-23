package aula04;

//Métodos Getter, Setter e Construtor
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Faber Castell", "Amarelo", 0.5f);
        //c1.setPonta(0.7f); //irá sobescrever o de cima
        //c1.setModelo("BIC");
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        c1.status();
        
        System.out.println("\n");
        Caneta c2 = new Caneta("Compacto", "Preta", 0.3f);
        c2.status();
    }
    
}
