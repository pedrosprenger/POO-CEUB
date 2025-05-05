// Classe Vendedor 
public class Vendedor extends Empregado {
    private double comissao;
    private double metaVendas;

    // Construtor
    public Vendedor(int id, String nome, String tipoDocumento, String documento, String endereco, String telefone, String email, String cargo, double salario, String departamento, double comissao, double metaVendas) {
        super(id, nome, tipoDocumento, documento, endereco, telefone, email, cargo, salario, departamento);
        this.comissao = comissao;
        this.metaVendas = metaVendas;
    }

    // Métodos específicos de Vendedor
    public void calcularComissao(double valorVenda) {
        double comissaoVenda = valorVenda * comissao;
        System.out.println("Comissão gerada pela venda: R$" + comissaoVenda);
    }

    public void atualizarMetaVendas(double novaMeta) {
        metaVendas = novaMeta;
    }

    public void verificarDesempenho() {
        System.out.println("Meta de vendas: R$" + metaVendas);
    }
}
