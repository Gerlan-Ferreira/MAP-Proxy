
public class BancoUsuarios {
	private String usuario;
	private String senha;

	public BancoUsuarios() {
		
	}

	public String getUsuario() {
		return new String("Usuario: " + usuario);
	}

	public String getSenha() {
		return new String("Senha: " + senha);
	}
}
