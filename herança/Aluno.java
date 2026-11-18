public class Aluno extends Pessoa{
    //Atributos
    private String matricula;
    //metodos
    public Aluno(String nome, Calendar data_Nascimento, long CPF, Endereco endereco){
        super(nome,data_Nascimento, CPF, endereco);
    }
}