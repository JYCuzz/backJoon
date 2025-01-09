import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = n; i > 0; i--) {
        	
        	int a = 0;
        	
        	for(int j = n; j > 0; j--) {
        		
        		if(i - j + a >= 0) {
        			System.out.print("*");
        		}
        		else
        			System.out.print(" ");
        	}
        	System.out.println("");
        	a++;
        }
    }
}