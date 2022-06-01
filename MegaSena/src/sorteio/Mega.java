package sorteio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Mega {

	public static void main(String[] args) {

		Random gerador = new Random();
		List<Integer> valores = new ArrayList<Integer>();

		int temp;

		for (int i = 0; i < 6; i++) {
			temp = gerador.nextInt(60) + 1;
			if (valores.contains(temp)) {
				i--;
			} else {
				valores.add(temp);
			}
		}

		for (int valor : valores) {
			System.out.println(valor);
		}
	}
}
