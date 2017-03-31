public class Coordenador extends Funcionario{
    private Integer ligacoes;
    public Coordenador(String nome, String dataNasc, Integer registro, double salario){
        super(nome, dataNasc, registro, salario);
        this.ligacoes = 0;
    }

    public void entrarEmContato(Aluno aluno){
        this.ligacoes++;
    }
    public Integer getLigacoes(){
        return this.contaLigacoes;
    }
}