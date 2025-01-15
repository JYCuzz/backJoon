import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int test_case = sc.nextInt();
    	int array[][] = new int[100][100];
    	int count = 0;
    	
    	for(int i = 0; i < test_case; i++) {
    		
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		
    		for(int j = a; j < a+10; j++) {
    			
    			for(int k = b; k < b+10; k++) {
    				
    				array[j][k] = 1;
    			}
    		}
    	}
    	
    	for(int j = 0; j < 100; j++) {
			
			for(int k = 0; k < 100; k++) {
				
				if(array[j][k] == 1) {
					count++;
				}
			}
		}
    	
    	System.out.println(count);	
    }
}
