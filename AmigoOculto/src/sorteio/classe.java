package sorteio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class classe {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		int valor;
		String amigo = "";

		lista.add("Matheus");
		lista.add("Joao");
		lista.add("Beatriz");
		lista.add("Marcus");
		lista.add("Vinicius");
		lista.add("Lucas Renan");
		lista.add("Lucas");
		lista.add("Danilo");
		lista.add("Filipe");
		lista.add("Arian");
		lista.add("Ana");
		lista.add("Nicolas");

		Random sorteio = new Random();

		for (int i = 0; i < 1; i++) {
			valor = sorteio.nextInt(lista.size());

			amigo += lista.get(valor);
		}
		System.out.println(amigo);
	}
}
