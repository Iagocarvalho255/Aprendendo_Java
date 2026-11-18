public class Pessoa{
    //Atributos
    private String nome;
    private Calendar data_Nascimento;
    private int idade;
    private long CPF;
    private Endereco endereco;
    //Métodos
    public Pessoa(String nome, Calendar data_Nascimento, long CPF, Endereco endereco){
        this.nome = nome;
        this.data_Nascimento = data_Nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        atualizarIdade();
    }
    protected void atualizarNome(String nome){
        this.nome = nome;
    }
    protected String recuperarNome(){
        return this.nome;
    }
    protected void atualizarIdade(){
        this.idade = calcularIdade();
    }
    protected int recuperarIdade(){
        return this.idade;
    }
    protected void atualizarCPF(long CPF){
        this.CPF =CPF;
    }
    protected long recuperarCPF(){
        return this.CPF;
    }
    protected void atualizarEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    protected Endereco(){
        return  this.endereco = endereco;
    }
    private int calcularIdade(){
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(YEAR) - data_Nascimento.get(YEAR);
        if ((data_Nascimento.get(MONTH) > hoje.get(MONTH)) ||
                (data_Nascimento.get(MONTH) == hoje.get(MONTH)
                        && data_Nascimento.get(DATE) > Hoje.get(DATE)))
            lapso--;
        return lapso;
    }
}
