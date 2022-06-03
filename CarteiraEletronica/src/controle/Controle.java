package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Modelo;
import visao.Tela;

public class Controle {
	List<Modelo> banco = new ArrayList <Modelo>();
	
	public void avaliarOpcao(int opcao) {
		Tela tela = new Tela();
		
		if (opcao == 1) { // Criacao da carteira

			banco.add(tela.desenharCarteira());

		} else if (opcao == 2) { // Exibir Saldo

			tela.exibirSaldo(banco);

		} else if (opcao == 3) { // Depositar Valor

			tela.colocarValor(banco);

		} else if (opcao == 4) { // Sacar Valor

			tela.retirarValor(banco);
		} 
	}

}
