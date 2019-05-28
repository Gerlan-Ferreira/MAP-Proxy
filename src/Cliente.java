
public class Cliente {
	public static void main(String[] args) {
		System.out.println("Usuario teste: ");
		BancoUsuarios banco = new BancoProxy("Hacker", "1234");
		System.out.println(banco.getUsuario());
		System.out.println(banco.getSenha());

		System.out.println("\nAdministrador acessando: ");
		banco = new BancoProxy("admin", "admin");
		System.out.println("Autenticaçao realizada com sucesso!");
		
	}
}
	