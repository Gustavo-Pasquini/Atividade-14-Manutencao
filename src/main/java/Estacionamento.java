public class Estacionamento {

    private String nome;
    private String cnpj;
    private Endereco endereco;

    public Estacionamento(String nome, String cnpj, String rua, String numero,
                          String bairro, String cidade, String estado, String cep) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = new Endereco(rua, numero, bairro, cidade, estado, cep);
    }

    public void imprimirDados() {
        System.out.println("Estacionamento: " + nome);
        System.out.println("CNPJ: " + cnpj);
        endereco.imprimirDados();
    }

    public String getEnderecoCompleto() {
        return endereco.getEnderecoCompleto();
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
