package sorteio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sorteio_melhorado {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		Random posicao = new Random();

		nomes.add("Matheus");
		nomes.add("Joao");
		nomes.add("Beatriz");
		nomes.add("Marcus");
		nomes.add("Vinicius");
		nomes.add("Lucas Renan");
		nomes.add("Lucas");
		nomes.add("Danilo");
		nomes.add("Filipe");
		nomes.add("Arian");
		nomes.add("Ana");
		nomes.add("Nicolas");

		System.out.println("O nome é " + nomes.get(posicao.nextInt(nomes.size())));

	}

}
