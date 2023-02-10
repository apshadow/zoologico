package view;

import model.Animal;
import model.Zebra;

public class App {

	public static void main(String[] args) {

		Animal pocoto = new Zebra();

		pocoto.setAlimento("capim");
		pocoto.setNome("Zebrinha Pocoto");
		pocoto.setRuido(" ri ");

		System.out.println(((Zebra) pocoto).falar());
	}

}
