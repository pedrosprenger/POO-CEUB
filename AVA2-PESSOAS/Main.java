// Classe principal para testar o código
public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente(1, "João", "CPF", "123.456.789-00", "Rua A, 123", "987654321", "joao@gmail.com", 5000.00);
        cliente.adicionarHistoricoCompra(200.50);
        cliente.verificarLimiteCredito();

        // Criando um fornecedor
        Fornecedor fornecedor = new Fornecedor(2, "Fornecedor X", "CNPJ", "12.345.678/0001-99", "Rua B, 456", "987654322", "fornecedor@x.com", "Produtos Eletrônicos", "12.345.678/0001-99");
        fornecedor.atualizarTipoProduto("Novos Produtos Eletrônicos");
        fornecedor.verificarFornecedorAtivo();

        // Criando um empregado
        Empregado empregado = new Empregado(3, "Carlos", "CPF", "987.654.321-00", "Rua C, 789", "987654323", "carlos@gmail.com", "Gerente", 6000.00, "Vendas");
        empregado.atualizarSalario(6500.00);

        // Criando um vendedor
        Vendedor vendedor = new Vendedor(4, "Ana", "CPF", "321.654.987-00", "Rua D, 321", "987654324", "ana@gmail.com", "Vendedor", 3500.00, "Vendas", 0.1, 50000.00);
        vendedor.calcularComissao(1000.00);

        // Criando um usuário do sistema
        UsuarioSistema usuario = new UsuarioSistema(5, "Paulo", "CPF", "654.321.987-00", "Rua E, 654", "987654325", "paulo@gmail.com", "paulo123", "senha123", "Admin");
        usuario.login();
    }
}
