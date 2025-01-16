import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int test_case = sc.nextInt();
    	
    	for(int i = 0; i < test_case; i++) {
    		
    		double n = sc.nextDouble();
    		n = n * 0.01;
    		
    		int a = (int)(n / 0.25);
    		System.out.print(a + " ");
    		n %= 0.25;
    		n = Math.round(n * 100) / 100.0;

    		int b = (int)(n / 0.10);
    		System.out.print(b + " ");
    		n %= 0.1;
    		n = Math.round(n * 100) / 100.0;
    		
    		int c = (int)(n / 0.05);
    		System.out.print(c + " ");
    		n %= 0.05;
    		n = Math.round(n * 100) / 100.0;
    		
    		int d = (int)(n / 0.01);
    		System.out.println(d);
    	}	
    }
}