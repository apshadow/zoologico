package model;

import java.util.Random;

public final class Zebra extends Mamifero {

	public Zebra() {
		super();
	}

	public Zebra(String nome, String ruido, String alimento) {
		super(nome, ruido, alimento);
	}

	@Override
	public String falar() {

		Random r = new Random();

		int qtd = r.nextInt(6);

		return super.getRuido().repeat(qtd);

	}

}
