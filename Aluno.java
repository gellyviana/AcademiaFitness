import java.util.HashMap;
public class Aluno extends Pessoa{

    private String matricula;
    private HashMap<Integer, String> agendaAluno;

    public Aluno(String nome, String dataNasc, String matricula){
        super(nome, dataNasc);
        this.matricula = matricula;
        agendaAluno = new HashMap<Integer, String>();
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getTreino(Integer horario){
        return agendaAluno.get(horario);
    }
    public void addTreino(Integer horario, String treino){
        agendaAluno.put(horario, treino) ;
    }
}