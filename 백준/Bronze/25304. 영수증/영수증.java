import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int y = 0;
		int z = 0;
		int plus = 0;
		int x = sc.nextInt();
		

		for(int i = 1; i <=x; i++) {
			y = sc.nextInt();
			z = sc.nextInt();
			plus = plus + (y * z);
		}
		if(total == plus) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}	
