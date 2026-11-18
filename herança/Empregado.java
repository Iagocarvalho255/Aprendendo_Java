public class Empregado extends Pessoa{
    //atributos
    protected String matricula;
    private Caledar data_admissao, data_demissao;
    //metodos
    public Empregado(String nome, Calendar data_Nascimento, long CPF, Endereco endereco){
        super(nome, data_Nascimento, CPF, endereco);
        this.matricula = geraMatricula();
        data_admissao = Calendar.getInstance();
    }
    public void demitirEmpregado(){
        data_demissao = Calendar.getInstance();
    }
    public void gerarMatricula(){
        this.matricula = "Matricula não definida";

    }
    protected String recuperaarMatricula(){
        return this.matricula;
    }
}