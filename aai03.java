import java.util.Scanner;

public class aai03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		
		System.out.printf("Digite um numero %n");
		x = ler.nextInt();
		
		if (x >= 0 && x <= 10) {
			System.out.printf("O número %d esta entre 0 e 10", x);
		} else {
			System.out.printf("O número %d NÃO esta entre 0 e 10", x);
		}

	}

}
