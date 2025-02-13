import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
	    	int n = sc.nextInt();
	    	
	    	if(n == -1) {
	    		
	    		break;
	    	}
	    	
	    	int array[] = new int[n];
	    	int count = 0;
	    	int sum = 0;
	    	
	    	for(int i = 1; i < n; i++) {
	    		
	    		if(n % i == 0) {
	    			array[count++] = i;
	    			sum += i;
	    		}
	    	}
	    	
	    	if(sum == n) {
	    		
	    		System.out.print(n + " = ");
	    		for(int i = 0; i < count; i++) {
	    			
	    			if(i != count -1) {
	    				System.out.print(array[i] + " + ");
	    			}
	    			else
	    				System.out.println(array[i]);
	    			
	    		}
	    		
	    	}
	    	
	    	else
	    		System.out.println(n + " is NOT perfect.");
    	}
    }
}