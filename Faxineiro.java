public class Faxineiro extends Funcionario{

    public Faxineiro(String nome, String dataNasc, Integer registro, double salario){
        super(nome, dataNasc, registro, salario);
    }
    public void limparAcademia(){
        System.out.println("Funcionario "+this.nome+" limpou!");
    }
}