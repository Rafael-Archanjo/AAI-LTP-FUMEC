import java.util.Scanner;

public class aai08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float sal, pres, perc;
		
		System.out.printf("Digite seu salario: %n");
		sal = ler.nextFloat();
		
		System.out.printf("Digite o valor da prestação: %n");
		pres = ler.nextFloat();
		
		perc = (float) (sal*0.30);
		
		if (pres > perc) {
			System.out.printf("Emprestimo NEGADO");
		} else {
			System.out.printf("Emprestimo APROVADO");
		}
		
	}

}
