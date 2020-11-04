package aula11;
//Herança de diferença
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    @Override //@Override serve para sobrepor uma classe em Java
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsita! Pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
