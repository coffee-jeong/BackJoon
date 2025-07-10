import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int x[] = new int[n];
		
		for(int i = 0; i < n; i ++) {
			x[i] = sc.nextInt();
		}
		
		int min = x[0];
		int max = x[0];
		
		for(int i = 1; i < n; i ++) {
			if(x[i] < min) {
				min = x[i];
			} else if(x[i] > max) {
				max = x[i];
			}
		}
		System.out.println(min +" "+ max);
		
	}

}
