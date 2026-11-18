public class Principal {
    //atributos
    private static Aluno aluno;
    private static Endereco endereco;
    //metodos main
    public static void main(Stringargs[]){
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        endereco = new Endereco();
        endereco.definirPais("Brasil");
        endereco.definirUF("RJ");
        endereco.definirCidade("Rio de Janeiro");
        endereco.definirRua("Avenida das Americas");
        endereco.definirNumero("6700");
        endereco.definirCEP(23087448);
        endereco.definirComplemento("Bloco 1, loja 126");
        aluno = new Aluno("Marcos Paulo", data, 901564098, endereco );
        aluno.atualizarIdade();
        idade = aluno.recuperarIdade();
}
    }