import java.util.Scanner;

public class aai02 {

	public static void main(String[] args) {	
		Scanner ler = new Scanner(System.in);
		int n;

		System.out.printf("Digite o numero: %n");
		n = ler.nextInt();

		if (n % 2 == 0) {
			System.out.printf("O numero é par");
		} else {
			System.out.printf("O numero é impar");
		}

	}

}
