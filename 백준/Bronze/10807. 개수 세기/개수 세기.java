import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int [] y = new int[x];
		
		for(int i = 0; i < x; i++) {
			
			y[i] = sc.nextInt();
			
		}
		
		int v = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < x; i++) {
			if(y[i] == v) {
				count ++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
