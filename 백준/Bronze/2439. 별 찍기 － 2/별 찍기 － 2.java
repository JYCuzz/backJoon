import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = 1;
        
        for(int i = 1; i <= n; i++) {
        	
        	for(int j = n; j >= 0; j--) {
        		
        		if((j + a - i) < i) {
        			System.out.print("*");
        		}
        		else if((j + a - i) > i) {
        			System.out.print(" ");
        		}
        	}
        	System.out.println("");
        	a++;
        }

    }
}