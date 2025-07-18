import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] basket = new int[N];
		
		for(int z = 0; z < M; z++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int t = i - 1; t <= j - 1; t++) {
				basket[t] = k;
			}
		}
		
		for(int t = 0; t < N; t++) {
			System.out.print(basket[t] + " ");
		}
		
	}
}
