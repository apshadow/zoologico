package model;

public abstract class Animal {

	private String nome;

	private String ruido;

	private String alimento;

	private boolean ectotermico;

	public Animal(String nome, String ruido, String alimento, boolean ectotermico) {
		super();
		this.nome = nome;
		this.ruido = ruido;
		this.alimento = alimento;
		this.ectotermico = ectotermico;
	}

	public Animal() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRuido() {
		return ruido;
	}

	public void setRuido(String ruido) {
		this.ruido = ruido;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public boolean isEctotermico() {
		return ectotermico;
	}

	protected void setEctotermico(boolean ectotermico) {
		this.ectotermico = ectotermico;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", ruido=" + ruido + ", alimento=" + alimento + ", ectotermico=" + ectotermico
				+ "]";
	}

	public String falar() {
		return ruido.repeat(3);
	}

}
