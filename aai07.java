import java.util.Scanner;

public class aai07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float peso,alt,imc;
		
		System.out.printf("Indique sua altura: %n");
		alt = ler.nextFloat();
		
		System.out.printf("Indique seu peso: %n");
		peso = ler.nextFloat();

		imc = (float) (peso/(alt * alt));
		
		if (imc < 18.5) {
			System.out.printf("O imc de %.2f indica MAGREZA", imc);
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.printf("O imc de %.2f indica NORMAL", imc);
		} else if (imc >= 25  && imc <= 29.9) {
			System.out.printf("O imc de %.2f indica SOBREPESO", imc);
		} else if (imc >= 30 && imc <= 39.9) {
			System.out.printf("O imc de %.2f indica OBESIDADE", imc);
		} else {
			System.out.printf("O imc de %.2f indica OBESIDADE GRAVE", imc);
		}
	}

}
