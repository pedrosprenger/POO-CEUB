// Classe Cliente
public class Cliente extends Pessoa {
    private double limiteCredito;
    private String historicoCompras;

    // Construtor
    public Cliente(int id, String nome, String tipoDocumento, String documento, String endereco, String telefone, String email, double limiteCredito) {
        super(id, nome, tipoDocumento, documento, endereco, telefone, email);
        this.limiteCredito = limiteCredito;
        this.historicoCompras = "";
    }

    // Métodos específicos de Cliente
    public void adicionarHistoricoCompra(double valor) {
        historicoCompras += "Compra de R$" + valor + "\n";
    }

    public void verificarLimiteCredito() {
        System.out.println("Limite de crédito disponível: R$" + limiteCredito);
    }

    public void atualizarLimiteCredito(double novoLimite) {
        limiteCredito = novoLimite;
    }
}
