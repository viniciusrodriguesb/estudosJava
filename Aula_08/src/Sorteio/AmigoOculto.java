package Sorteio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AmigoOculto {
	public static void main(String[] args) throws ParseException {
		int numeroParticipantes;
		String nome, continua, presente, aniversario;
		Participante participante;

		Calendar c = Calendar.getInstance();
		Date data = c.getTime();

		List<Participante> nomes = new ArrayList<Participante>();
		Random posicao = new Random();

		Scanner teclado = new Scanner(System.in);

		System.out.println("Quantas pessoas deseja inserir? ");
		numeroParticipantes = teclado.nextInt();

		for (int i = 0; i < numeroParticipantes; i++) {
			participante = new Participante();

			System.out.println("Digite o nome do participante " + (i + 1));
			nome = teclado.next();

			System.out.println("Digite o presente ");
			presente = teclado.next();

			System.out.println("Digite a data de aniversario");
			aniversario = teclado.next();

			// Inserindo o Nome e Presente dentro da variavel participante, que será
			// inserida no Objeto.
			participante.setNome(nome);
			participante.setPresente(presente);

			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			participante.setAniversario(formato.parse(aniversario));

			nomes.add(participante);
		}

		System.out.println("Deseja fazer o sorteio agora? (S/N)");
		continua = teclado.next();

		if (continua.equals("S")) {
			/*
			 * System.out.println("O nome sorteado é " +
			 * nomes.get(posicao.nextInt(nomes.size())).getNome() + " , Presente: " +
			 * nomes.get(posicao.nextInt(nomes.size())).getPresente());
			 */
			System.out.println(nomes.get(posicao.nextInt(nomes.size())));
		} else {
			System.out.println("O soteio foi cancelado! ");
		}
	}
}