import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int max = 0;
    	int sum = 0;
    	int array[] = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		array[i] = sc.nextInt();
    	}
    	
    	for(int i = 0; i < array.length; i++) {
    		
    		for(int j = 0; j < array.length; j++) {
    			
    			for(int k = 0; k < array.length; k++) {
    				
    				if(array[i] != array[j] && array[i] != array[k] && array[j] != array[k]) {
    					
    					sum = array[i] + array[j] + array[k];
    					
    					if(max <= m && sum <= m) {
    						
    						if(max < sum) {
    							
    							max = sum;
    						}
    					}
    				}
    			}
    		}
    	}
    	System.out.println(max);
    }	 
}