import java.util.Locale;
import java.util.Scanner;

public class URI1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a;
		double b;
		double MEDIA;

		a = sc.nextDouble();
		b = sc.nextDouble();

		MEDIA = (a * 3.5 + b * 7.5) / 11;
		System.out.printf("MEDIA = %.5f\n", MEDIA);
		sc.close();
	}

}
