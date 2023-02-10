package model;

public abstract class Ave extends Animal {

	public Ave() {
		super();
		super.setEctotermico(false);
	}

	public Ave(String nome, String ruido, String alimento) {
		super(nome, ruido, alimento, false);
	}

}
