import java.util.Locale;
import java.util.Scanner;

public class URI1019 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		int horas;
		int segundos;
		int minutos, resto;

		n = sc.nextInt();

		horas = n / 3600;
		resto = n % 3600;
		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();

	}

}
