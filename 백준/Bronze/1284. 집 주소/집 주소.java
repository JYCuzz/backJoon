import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	
	        String n = sc.next();
	        
	        if(n.equals("0")) {
	        	System.exit(0);
	        }
	        
	        BigInteger sum1 = BigInteger.valueOf(2);

	        
	        for(int i = 0; i < n.length(); i++) {
	        	
	        	if(n.charAt(i) == '1') {
	        		sum1 = sum1.add(BigInteger.valueOf(2));
	        	}
	        	else if(n.charAt(i) == '0') {
	        		sum1 = sum1.add(BigInteger.valueOf(4));
	        	}
	        	else {
	        		sum1 = sum1.add(BigInteger.valueOf(3));
	        	}	
	        }
	        
	        if(n.length() >= 2) {
	        	
	        	sum1 = sum1.add(BigInteger.valueOf(n.length()-1));
	        }
	              
	        System.out.println(sum1);
        }
        
    }
}