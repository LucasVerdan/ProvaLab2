package Marketplace;

public class Cliente {

	
	private String nome;
	private int prioridade;
	
	public Cliente(String nome, int prioridade) {
		this.nome = nome;
		this.prioridade = prioridade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	@Override
	public String toString() {
		return "Cliente [Nome:" + nome + ", Prioridade:" + prioridade + "]";
	}
}
