import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] s = new boolean[31];
		
		for(int i = 1; i <= 28; i++) {
			int x = sc.nextInt();
			s[x] = true;
		}
		
		for(int i = 1; i <= 30; i ++) {
			if(!s[i]) {
				System.out.println(i);
			}
		}
	}
}
