public class Funcionario extends Pessoa{

    private Integer registro;
    private double salario;

    public Funcionario(String nome, String dataNasc, Integer registro, double salario){
        super(nome, dataNasc);
        this.registro = registro;
        this.salario = salario;
    }
    public Integer getRegistro(){
        return this.registro;
    }
    public void setRegistro(Integer registro){
        this.registro = registro;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }


}