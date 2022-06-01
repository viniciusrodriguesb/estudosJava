package atividade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int opcao;
		int idade, estrela;
		String nome, telefone;

		Cliente cliente;
		App app = new App();

		List<Cliente> banco = new ArrayList<Cliente>();
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("--------MENU--------");
			System.out.println("1 - Ler Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Média de idade");
			System.out.println("4 - Alterar cliente ");
			System.out.println("5 - Excluir cliente ");
			System.out.println("6 - Classificar cliente");
			System.out.println("7 - Verificar cliente com alta classificação");
			System.out.println("8 - Fim ");
			System.out.println("--------------------");
			System.out.println("Digite uma opcão: ");

			opcao = teclado.nextInt();

			if (opcao == 1) { // Inclusão do cliente

				cliente = new Cliente();

				System.out.println("--------------------------");
				System.out.println("Informe o nome do cliente: ");
				nome = teclado.next();
				cliente.setNome(nome);

				System.out.println("Informe o telefone: ");
				telefone = teclado.next();
				cliente.setTelefone(telefone);

				System.out.println("Qual a idade do cliente: ");
				idade = teclado.nextInt();
				cliente.setIdade(idade);

				banco.add(cliente);

			} else if (opcao == 2) { // Ver clientes inclusos

				for (Cliente c : banco) {
					System.out.println(c);
				}

			} else if (opcao == 3) { // Verificar média de idade dos clientes

				System.out.println("Média das idades é: " + app.calcularMedia(banco));

			} else if (opcao == 4) { // Alterar dados do clientes
				System.out.println("Qual cliente você deseja alterar ");
				
				int i = teclado.nextInt();

				Cliente dadosCliente = banco.get(i);
				
				System.out.println(banco.get(i));
				
				System.out.println("Informe o nome do cliente: ");
				nome = teclado.next();
				dadosCliente.setNome(nome);

				System.out.println("Informe o telefone: ");
				telefone = teclado.next();
				dadosCliente.setTelefone(telefone);

				System.out.println("Qual a idade do cliente: ");
				idade = teclado.nextInt();
				dadosCliente.setIdade(idade);

			} else if (opcao == 5) { // Remover

				System.out.println("Qual cliente deseja remover ");
				banco.remove(teclado.nextInt());

			} else if (opcao == 6) { // Classificar
				int i;
				int estrelas;

				System.out.println("Qual cliente você deseja classificar? ");
				i = teclado.nextInt();

				Cliente dadosCliente2 = banco.get(i); 

				System.out.println("Avalie o cliente: (1-5)");
				estrela = teclado.nextInt();

				dadosCliente2.setEstrela(estrela);

			} else if (opcao == 7) { // Ver clientes premium
				for (Cliente c : banco) {
					if (c.getEstrela() == 5) {
						System.out.println("O Cliente premium " + c.getNome());
					}
				}
			}
		} while (opcao < 8);
		teclado.close();
	}

	// Método para média de idade
	public double calcularMedia(List<Cliente> lista) {
		int somaIdade = 0;

		for (Cliente c : lista) {
			somaIdade += c.getIdade();
		}
		return (somaIdade / lista.size());
	}
}