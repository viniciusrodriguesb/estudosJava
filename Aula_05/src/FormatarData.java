import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatarData {

	public static void main(String[] args) {

		// Formatação Padrão:
		Calendar c = Calendar.getInstance();
		c.set(2030, Calendar.FEBRUARY, 28);
		Date data = c.getTime();

		System.out.println("Data atual sem formatação: " + data);

		// Formatação Data
		DateFormat formataData = DateFormat.getDateInstance();
		System.out.println("Data atual com formatação: " + formataData.format(data));

		// Formatação Hora
		DateFormat hora = DateFormat.getTimeInstance();
		System.out.println("Hora formatada: " + hora.format(data));

		// Formatação Data e Hora
		DateFormat dataHora = DateFormat.getDateTimeInstance();
		System.out.println(dataHora.format(data));

		// Teste Avulso
		DateFormat teste = DateFormat.getDateInstance();
		DateFormat teste2 = DateFormat.getTimeInstance();
		System.out.println("O corpo foi encontrado ás: " + teste2.format(data) + " do dia: " + teste.format(data));

	}

}
