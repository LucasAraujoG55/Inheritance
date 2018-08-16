package HerancaPt2;
public class Aula11 {
    public static void main(String[] args){ 
    
    /**Visitante v1 = new Visitante();
    v1.setNome("Lucas");
    v1.setIdade(33);
    v1.setSexo("M");
    System.out.println(v1.toString());*/
    
    Aluno a1 = new Aluno();
    a1.setNome("Chris");
    a1.setMatricula(1111);
    a1.setCurso("Engenharia");
    a1.setIdade(19);
    a1.setSexo("F");
    a1.pagarMensalidade();
    //System.out.println(a1.toString());
    Bolsista b1 = new Bolsista();
    b1.setMatricula(2223);
    b1.setNome("Jobi");
    b1.setBolsa(20);
    b1.pagarMensalidade();
    
    }
}
