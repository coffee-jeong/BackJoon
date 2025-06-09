import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String y = sc.next();
		
		int y1 = y.charAt(2) - '0';
		int y2 = y.charAt(1) - '0';
		int y3 = y.charAt(0) - '0';
		
		System.out.println(x * y1);
		System.out.println(x * y2);
		System.out.println(x * y3);
		System.out.println(x * Integer.parseInt(y));
	}
}