import java.util.Scanner;

public class aai09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float x, y, result;
		int tipo;

		System.out.printf("Insira o primeiro n�mero: %n");
		x = ler.nextFloat();

		System.out.printf("Insira o segundo n�mero: %n");
		y = ler.nextFloat();

		System.out.printf(
				"Digite o tipo de opera��o que deseja fazer %n 1 para SOMA %n 2 para SUBTRA��O %n 3 para MULTIPLICA��O %n 4 para DIVIS�O %n 5 para SAIR %n");
		tipo = ler.nextInt();

		switch (tipo) {
		case 1:
			result = (x + y);
			System.out.printf("O resultado de %.2f + %.2f � igual a %.2f", x, y, result);
			break;

		case 2:
			result = (x - y);
			System.out.printf("O resultado de %.2f - %.2f � igual a %.2f", x, y, result);
			break;

		case 3:
			result = (x * y);
			System.out.printf("O resultado de %.2f * %.2f � igual a %.2f", x, y, result);
			break;

		case 4:
			result = (x / y);
			System.out.printf("O resultado de %.2f / %.2f � igual a %.2f", x, y, result);
			break;

		case 5:
			System.out.printf("Opera��o cancelada");
			break;
		}

	}

}
