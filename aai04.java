import java.util.Scanner;

public class aai04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,y,z;
		
		System.out.printf("Digite o numero X: %n");
		x = ler.nextInt();
		
		System.out.printf("Digite o numero Y: %n");
		y = ler.nextInt();
		
		System.out.printf("Digite o numero z: %n");
		z = ler.nextInt();
		
		if (x > y && y > z || x > z && z > y) {
			System.out.printf("O maior numero é %d", x);
		} else if (z > y && y > x || z > x && x > y) {
			System.out.printf("O maior numero é %d", z);
		} else if (y > x && x > z || y > z && z > x) {
			System.out.printf("O maior numero é %d", y);
		}
	}

}
