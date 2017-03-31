public class Main{
    public static void main(String []args){
       
        Professor prof1 = new Professor("João", "28/09/1988", 021547, 5000.00);
        Vendedores vendedor = new Vendedores("Carlos","25/45/78", 10456, 1000.0);
        Aluno aluno1 = new Aluno("Maria", "01/04/56", "00003624");
        vendedor.elaborarPacote();
        aluno1.addTreino(20, "Natação");
        Aluno aluno2 = new Aluno("Marcos", "29/02/5555", "1024563");
        vendedor.elaborarPacote();
        aluno2.addTreino(10, "Musculação");
        Aluno aluno3 = new Aluno("Antonia", "15/06/2000", "4697799");
        vendedor.elaborarPacote();
        aluno3.addTreino(6, "Pilates");
        
        prof1.setTreino(6, aluno3);
        prof1.setTreino(20, aluno1);
        prof1.setTreino(10, aluno2);


    }
}