package model;

public abstract class Mamifero extends Animal {

	public Mamifero() {
		super();
		super.setEctotermico(false);
	}

	public Mamifero(String nome, String ruido, String alimento) {
		super(nome, ruido, alimento, false);
	}

}
