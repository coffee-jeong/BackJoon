import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();

		for(int i = 1; i <= x; i++) {
			for(int y = 1; y <= x - i; y++) {
				System.out.print(" ");
			}
			
			for(int z = 1; z <= i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
