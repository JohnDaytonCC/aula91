package entities;

public class Aluno {
	private String nome;
	private String email;
	private Integer numeroDoQuarto;
	
	public Aluno(String nome, String email, int numeroDoQuarto) {
		this.nome = nome;
		this.email = email;
		this.numeroDoQuarto = numeroDoQuarto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumeroDoQuarto() {
		return numeroDoQuarto;
	}



	public void setNumeroDoQuarto(int numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}



	public void relatorioDoAluno() {
		 System.out.println(numeroDoQuarto + ": "+ nome + ", " + email);
	}
	

}
