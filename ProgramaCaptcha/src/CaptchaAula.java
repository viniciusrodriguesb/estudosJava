import java.util.Random;
import java.util.Scanner;

public class CaptchaAula {

	public static void main(String[] args) {
		// Variáveis
		Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);
		String captcha;

		// Random
		for (int i = 0; i < 1; i++) {
			System.out.println(gerador.nextInt());
		}

		System.out.println("Digite o CAPTCHA escrito acima: ");
		captcha = teclado.next();

		// Loop
		do {
			for (int i = 0; i < 1; i++) {
				System.out.println(gerador.nextInt());
			}

			System.out.println("Digite o CAPTCHA escrito acima: ");
			captcha = teclado.next();
		} while (captcha.equals(gerador));
	}
}