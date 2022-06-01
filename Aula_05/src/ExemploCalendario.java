import java.util.Calendar;

//Exemplo de Calendar 
public class ExemploCalendario {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Data e hora atual: " + c.getTime());

		// Adiocionando separadamente:
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
	}
}
