import java.util.HashMap;
public class Professor extends Funcionario{

    private HashMap<Integer, Aluno> agenda; 
    public Professor(String nome, String dataNasc, Integer registro, double salario){
        super(nome, dataNasc, registro, salario);
        agenda = new HashMap<Integer, Aluno>();
    }

    public Aluno mostraAluno(Integer horario){
        return agenda.get(horario);
    }

    public Integer getNumAlunos(Integer comecouATrabalhar){
        Integer numAlunos = 0;
        for(Integer horario: agenda.keySet()){
            if(horario >= comecouATrabalhar && horario < comecouATrabalhar+3){
                numAlunos++;
            }
        }
        return numAlunos;
    }
     public void setTreino(Integer horario, Aluno aluno){
        agenda.put(horario,aluno);
    }
    
}