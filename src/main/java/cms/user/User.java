package cms.user;

public abstract class User {

	protected int id;
	protected String nome;
	protected String email;
	protected String password;

	public User(int id, String nome, String email, String password) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public abstract boolean checkPassword(String p);
}
