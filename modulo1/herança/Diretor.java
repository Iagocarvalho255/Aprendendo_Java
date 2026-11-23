import java.util.Calendar;
import java.util.UUID;
public class Diretor extends Empregado {
    //Métodos
    public Diretor(String nome, Calendar data_nascimento, long CPF, Endereco endereco){
        super(nome, data_nascimento, CPF, endereco);
    }

    public String gerarMatricula(){
       return this.matricula = "E-" + UUID.randomUUID().toString();
    }
    protected void alterarMatricula(){
        gerarMatricula();
    }
    protected void alterarMatricula(String matricula){
        this.matricula = matricula;
    }
}
