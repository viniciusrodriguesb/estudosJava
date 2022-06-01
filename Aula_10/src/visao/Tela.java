package visao;

import java.util.List;
import java.util.Scanner;

import modelo.Cliente;
import util.Util;

public class Tela {

	public Cliente desenharIncluir() {
		Scanner teclado = new Scanner(System.in);
		String nome, telefone;
		int idade;
		Cliente cliente = new Cliente();

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

		return cliente;

	}

	public void listarCliente(List<Cliente> banco) {
		for (Cliente c : banco) {
			System.out.println(c);
		}
	}

	public void exibirMedia(List<Cliente> banco) {
		// Verificar média de idade dos clientes
		Util util = new Util();

		System.out.println("Média das idades é: " + util.calcularMedia(banco));
	}

	public void alterarCliente(List<Cliente> banco) {
		Scanner teclado = new Scanner(System.in);
		String nome, telefone;
		int idade;
		Cliente cliente = new Cliente();

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
	}

	public void excluirCliente(List<Cliente> banco) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Qual cliente deseja remover ");
		banco.remove(teclado.nextInt());
	}

	public void classificarCliente(List<Cliente> banco) {
		Scanner teclado = new Scanner(System.in);
		String nome, telefone;
		int idade;
		Cliente cliente = new Cliente();

		int i;
		int estrela;

		System.out.println("Qual cliente você deseja classificar? ");
		i = teclado.nextInt();

		Cliente dadosCliente2 = banco.get(i);

		System.out.println("Avalie o cliente: (1-5)");
		estrela = teclado.nextInt();

		dadosCliente2.setEstrela(estrela);
	}

	public void clientePremium(List<Cliente> banco) {

		for (Cliente c : banco) {
			if (c.getEstrela() == 5) {
				System.out.println("O Cliente premium " + c.getNome());
			}
		}
	}
}