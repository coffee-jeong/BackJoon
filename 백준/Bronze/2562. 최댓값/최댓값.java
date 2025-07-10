import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 9;
		int y[] = new int [x];
		
		for(int i = 0; i < x; i++) {
			y[i] = sc.nextInt();
		}
		
		int max = y[0];
		int maxIndex = 0;
		for(int i = 1; i < x; i++) {
			if(y[i] > max) {
				max = y[i];
				maxIndex  = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxIndex + 1);
	}
}
