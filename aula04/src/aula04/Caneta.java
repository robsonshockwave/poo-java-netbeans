package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    //o método construtor tem o mesmo nome da classe
    public Caneta(String m, String c, float p) {
        this.setModelo(m); //pode fazer assim
        this.cor = c;      //ou assim
        this.ponta = p;
        this.tampar();
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Modelo: " + this.getModelo()); //pode fazer assim
        System.out.println("Cor: " + this.cor);            //ou assim
        System.out.println("Tampada: " + this.tampada);
    }
}
