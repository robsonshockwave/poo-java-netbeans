package aula11;

//Heranças
/*
Classe Abstrata:
Não pode ser instanciada. Só pode servir como progenitora.
Método Abstrato:
Declarado, mas não implementado na progenitora. Fica na interface.
Classe Final:
Não pode ser herdada por outra classe. Obrigatoriamente folha.
Método Final:
Não pode ser sobrescrito pelas suas sub-classes. Obrigatoriamente herdado.
*/
public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); //não pode ser instaciando por ser abstrata
        
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudia");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(45);
        a1.setSexo("F");
        a1.pagarMensalidade();
        System.out.println(v1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Bolsonero");
        b1.setMatricula(2222);
        b1.setBolsa(12.5f);
        b1.setCurso("Gestão de Recursos Humanos");
        b1.setIdade(58);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(v1.toString());
    }
    
}
