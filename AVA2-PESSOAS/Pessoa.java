// Classe  Pessoa
public class Pessoa {
    protected int id;
    protected String nome;
    protected String tipoDocumento;
    protected String documento;
    protected String endereco;
    protected String telefone;
    protected String email;

    // Construtor
    public Pessoa(int id, String nome, String tipoDocumento, String documento, String endereco, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    // Métodos comuns
    public void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void atualizarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public void verificarDocumentoValido() {
        System.out.println("Verificando documento: " + documento);
    }
}
