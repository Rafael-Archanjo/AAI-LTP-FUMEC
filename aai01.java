import java.util.Scanner;

public class aai01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		
		System.out.printf("Digite um numero %n");
		x = ler.nextInt();
		
		if (x >= 0) {
			System.out.printf("Seu número é %d", x);
		} else {
			x = x * (-1);
			System.out.printf("Seu número é %d", x);
		}

	}

}
