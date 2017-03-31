public class Pessoa{

    private String nome;
    private String dataNasc;
    public Pessoa(String nome, String dataNasc){
        this.nome = nome;
        this.dataNasc = dataNasc;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDataNasc(){
        return this.dataNasc;
    }
    public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }
    public void imprime(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data nascimento: " + this.getDataNasc());
        
    }
}