import java.util.Scanner;

public class aai05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char x;
		
		System.out.printf("Digite uma letra %n");
		x = ler.next().charAt(0);
		
		if (x == 'a' || x == 'e' || x == 'o' || x == 'i' || x == 'u') {
			System.out.printf("A letra %c é uma vogal", x);
		} else {
			System.out.printf("A letra %c é uma consoante", x);
		}
		
	}

}
