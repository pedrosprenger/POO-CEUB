// Classe UsuarioSistema
public class UsuarioSistema extends Pessoa {
    private String login;
    private String senha;
    private String perfil;

    // Construtor
    public UsuarioSistema(int id, String nome, String tipoDocumento, String documento, String endereco, String telefone, String email, String login, String senha, String perfil) {
        super(id, nome, tipoDocumento, documento, endereco, telefone, email);
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    // Métodos específicos de UsuarioSistema
    public void login() {
        System.out.println("Usuário " + login + " logado com sucesso.");
    }

    public void alterarSenha(String novaSenha) {
        senha = novaSenha;
    }

    public void verificarPermissao() {
        System.out.println("Perfil do usuário: " + perfil);
    }
}
