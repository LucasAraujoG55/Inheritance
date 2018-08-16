package HerancaPt2;
public class Aluno extends Pessoa {
    private int matricula; 
    private String curso;
    
    public /*final*/ void pagarMensalidade(){ 
        System.out.println("Mensalidade paga "+this.getNome());
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   
    
   
}
