package visao;

import java.util.List;
import java.util.Scanner;
import modelo.Modelo;

public class Tela {
	public Modelo desenharCarteira() {
		String nome;
		double saldo = 0;
		Scanner teclado = new Scanner(System.in);

		Modelo modelo = new Modelo();

		System.out.println("--------------------------");
		System.out.println("Bem vindo! Informe seu nome para cadastrar: ");
		nome = teclado.next();
		modelo.setNome(nome);

		System.out.println("--------------------------");
		System.out.println("Para continuar o cadastro, faça seu primeiro depósito:  ");
		saldo = teclado.nextDouble();
		modelo.setSaldo(saldo);

		if (saldo < 10) {
			System.out.println("Não foi possivel prosseguir com o cadastro, insira um valor acima de 10 reais.");

			System.out.println("--------------------------");
			System.out.println("Para continuar o cadastro, faça seu primeiro depósito:  ");
			saldo = teclado.nextDouble();
			modelo.setSaldo(saldo);
		}
		return modelo;
	}

	public void exibirSaldo(List<Modelo> banco) {
		int escolha;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Selecione a carteira que deseja visualizar: ");
		escolha = teclado.nextInt();

		System.out.println(banco.get(escolha));

	}

	public Modelo colocarValor(List<Modelo> banco) {
		double deposito, attSaldo;
		int escolha;

		Scanner teclado = new Scanner(System.in);
		Modelo modelo = new Modelo();

		System.out.println("Selecione a carteira desejada: ");
		escolha = teclado.nextInt();

		System.out.println("A carteira selecionada foi: " + banco.get(escolha));

		System.out.println("Digite o valor que deseja depositar: ");
		deposito = teclado.nextDouble();
		modelo.setSaldo(deposito);

		attSaldo = deposito + modelo.getSaldo();

		banco.get(escolha).setSaldo(attSaldo);

		return modelo;
	}

	public Modelo retirarValor(List<Modelo> banco) {
		double saque, attSaldo;
		int escolha;

		Scanner teclado = new Scanner(System.in);
		Modelo modelo = new Modelo();

		System.out.println("Selecione a carteira desejada: ");
		escolha = teclado.nextInt();

		System.out.println("A carteira selecionada foi: " + banco.get(escolha));

		System.out.println("Digite o valor que deseja sacar: ");
		saque = teclado.nextDouble();
		modelo.setSaldo(saque);

		if (saque > banco.get(escolha).getSaldo()) {
			System.out.println("Não foi possível realizar esta operação. Saldo insuficiente! ");
		} else {
			attSaldo = banco.get(escolha).getSaldo() - saque;
			banco.get(escolha).setSaldo(attSaldo);
			System.out.println("Saque realizado.");
		}
		return modelo;
	}
}