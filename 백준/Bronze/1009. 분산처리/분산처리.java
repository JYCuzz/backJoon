import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		for(int i = 0; i < test_case; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = 1;
			
			for(int j = 0; j < b; j++) {
				
				k = k * a;
				
				k = k % 10;

			}
			if(k == 0) {
				System.out.println(10);
			}
			else {
				System.out.println(k);
			}
		}
	}
}