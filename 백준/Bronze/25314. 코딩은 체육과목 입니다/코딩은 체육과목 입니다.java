import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int count = x / 4;
		
		for(int i = 0; i < count; i ++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}
