// Classe Empregado
public class Empregado extends Pessoa {
    private String cargo;
    private double salario;
    private String departamento;

    // Construtor
    public Empregado(int id, String nome, String tipoDocumento, String documento, String endereco, String telefone, String email, String cargo, double salario, String departamento) {
        super(id, nome, tipoDocumento, documento, endereco, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Métodos específicos de Empregado
    public void atualizarCargo(String novoCargo) {
        cargo = novoCargo;
    }

    public void atualizarSalario(double novoSalario) {
        salario = novoSalario;
    }

    public void atualizarDepartamento(String novoDepartamento) {
        departamento = novoDepartamento;
    }
}
