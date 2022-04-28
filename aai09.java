import java.util.Scanner;

public class aai09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float x, y, result;
		int tipo;

		System.out.printf("Insira o primeiro número: %n");
		x = ler.nextFloat();

		System.out.printf("Insira o segundo número: %n");
		y = ler.nextFloat();

		System.out.printf(
				"Digite o tipo de operação que deseja fazer %n 1 para SOMA %n 2 para SUBTRAÇÃO %n 3 para MULTIPLICAÇÃO %n 4 para DIVISÃO %n 5 para SAIR %n");
		tipo = ler.nextInt();

		switch (tipo) {
		case 1:
			result = (x + y);
			System.out.printf("O resultado de %.2f + %.2f é igual a %.2f", x, y, result);
			break;

		case 2:
			result = (x - y);
			System.out.printf("O resultado de %.2f - %.2f é igual a %.2f", x, y, result);
			break;

		case 3:
			result = (x * y);
			System.out.printf("O resultado de %.2f * %.2f é igual a %.2f", x, y, result);
			break;

		case 4:
			result = (x / y);
			System.out.printf("O resultado de %.2f / %.2f é igual a %.2f", x, y, result);
			break;

		case 5:
			System.out.printf("Operação cancelada");
			break;
		}

	}

}
