package controle;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import visao.Tela;

public class Controle {
	List<Cliente> banco = new ArrayList<Cliente>();

	public void avaliarOpcao(int opcao) {
		Tela tela = new Tela();

		if (opcao == 1) { // Inclusão do cliente

			banco.add(tela.desenharIncluir());

		} else if (opcao == 2) { // Listar Clientes

			tela.listarCliente(banco);

		} else if (opcao == 3) { // Média Idade Cliente

			tela.exibirMedia(banco);

		} else if (opcao == 4) { // Alterar dados do clientes

			tela.alterarCliente(banco);

		} else if (opcao == 5) { // Remover

			tela.excluirCliente(banco);

		} else if (opcao == 6) { // Classificar

			tela.classificarCliente(banco);

		} else if (opcao == 7) { // Ver clientes Premium

			tela.clientePremium(banco);
		}
	}
}
