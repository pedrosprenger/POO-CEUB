// Classe Fornecedor 
public class Fornecedor extends Pessoa {
    private String tipoProduto;
    private String cnpj;

    // Construtor
    public Fornecedor(int id, String nome, String tipoDocumento, String documento, String endereco, String telefone, String email, String tipoProduto, String cnpj) {
        super(id, nome, tipoDocumento, documento, endereco, telefone, email);
        this.tipoProduto = tipoProduto;
        this.cnpj = cnpj;
    }

    // Métodos específicos de Fornecedor
    public void atualizarTipoProduto(String novoProduto) {
        tipoProduto = novoProduto;
    }

    public void verificarFornecedorAtivo() {
        System.out.println("Fornecedor CNPJ " + cnpj + " está ativo.");
    }

    public void atualizarCNPJ(String novoCNPJ) {
        cnpj = novoCNPJ;
    }
}
