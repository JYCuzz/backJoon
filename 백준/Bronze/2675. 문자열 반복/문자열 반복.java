import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int test_case = sc.nextInt();
        
        for(int i = 0; i < test_case; i++) {
        	
        	int r = sc.nextInt();
        	String a = sc.next();
        	
        	String array[] = a.split("");
        	
        	for(int j = 0; j < array.length; j++) {
        		
        		for(int k = 0; k < r; k++) {
        			
        			System.out.print(array[j]);
        		}
        	}
        	
        	System.out.println("");
        
        }
    }
}