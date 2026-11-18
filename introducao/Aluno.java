 import java.util.Random;
public class Aluno {
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;

    public Aluno(String nome, int idade) {
        aleatorio = new Random();
        this.nome = nome;
        this.idade = idade;
        this.codigo_identificador = aleatorio.nextDouble();
    }

    public void definirNome(String nome) {
        this.nome = nome;
    }
    public void definirIdade(int idade){
        this.idade = idade;
    }
    public String recuperarNome(){
        return nome;
    }
    public int recuperarIdade(){
        return idade;
    }

    public static void main(String args[]){
        Aluno a = new Aluno("", 0);
        Aluno b = new Aluno("",0);
        a.definirNome ("Roberto");
        b.definirNome ("Paulo");
        a.definirIdade(25);
        b.definirIdade(30);
        System.out.println("Nome: "+a.recuperarNome()+" Idade: "+a.recuperarIdade());
        System.out.println("Nome: "+b.recuperarNome()+" Idade: "+b.recuperarIdade());
    }
}