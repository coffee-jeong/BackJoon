import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x = sc.nextInt();
		
		int n[] = new int[t];
		
		for(int i = 0; i < t; i ++) {
			n[i] = sc.nextInt();
			
			if(n[i] < x) {
				System.out.println(n[i]);
			}
		}
		
	}
}
