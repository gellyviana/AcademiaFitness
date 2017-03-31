public class Vendedor extends Funcionario{

    public Vendedor(String nome, String dataNasc, Integer registro, double salario){
        super(nome, dataNasc, registro, salario);
    }
    public void elaborarPacote(){
        System.out.println("Vendedor "+this.nome+" criou um pacote!");
    }
}