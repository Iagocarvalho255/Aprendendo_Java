class Endereco{
    private String nome_rua;
    private int numero;
    //Construtor
    public Endereco(String nome_rua, int numero){
        this.nome_rua = nome_rua;
        this.numero = numero;
    }
    //metodo para atualizar dados
    public void cadastrarEndereco(String nome_rua, int numero){
        this.nome_rua = nome_rua;
        this.numero = numero;
    }
    // Método para retornar o endereço formatado como texto
    public String obterEndereco(){
        return this .nome_rua +", "+ this.numero;
    }
    public static void main(String args[]){
        Endereco a = new Endereco("",0);
        Endereco b = new Endereco("", 0);
        a.cadastrarEndereco("carobeira", 245);
        b.cadastrarEndereco("celidonia", 355);
        System.out.println(a.obterEndereco());
        System.out.println(b.obterEndereco());
    }
}