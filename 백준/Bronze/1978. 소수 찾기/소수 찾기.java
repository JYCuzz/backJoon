import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int num_count = 0;
    	
    	for(int i = 0; i < N; i++) {
    		
    		int a = sc.nextInt();
    		int count = 0;
    		
    		for(int j = 1; j <= a; j++) {
    			
    			if(a % j == 0) {
    				count++;
    			}
    		}
    		
    		if(count == 2) {
    			
    			num_count++;
    		}
    	}
    	System.out.println(num_count);
    }
}