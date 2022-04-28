import java.util.Scanner;

public class aai06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float x,y,z, med;
		
		System.out.printf("Digite o valor da 1º prova: %n");
		x = ler.nextFloat();

		System.out.printf("Digite o valor da 2º prova: %n");
		y = ler.nextFloat();
		
		System.out.printf("Digite o valor da 3º prova: %n");
		z = ler.nextFloat();
		
		med = (float) (x + y + z)/ 3;
		
		if (med >= 6) {
			System.out.printf("O aluno foi aprovado com uma nota de %.2f" ,med);
			
		} else {
			System.out.printf("O aluno foi reprovado com uma nota de %.2f" ,med);
		}
	}

}
