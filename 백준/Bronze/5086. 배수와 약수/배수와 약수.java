import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    
    	while(true) {	
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
    		if(a == 0 && b == 0) {
        		
        		System.exit(0);
        	}
        	else {
            	if(a % b == 0) {
            		System.out.println("multiple");
            	}
            	else if(b % a == 0) {
            		System.out.println("factor");
            	}
            	else 
            		System.out.println("neither");
        	}
    	}
    }
}