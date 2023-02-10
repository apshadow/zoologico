package model;

public abstract class Reptil extends Animal {

	public Reptil() {
		super();
		super.setEctotermico(true);
	}

	public Reptil(String nome, String ruido, String alimento) {
		super(nome, ruido, alimento, true);
	}

}
