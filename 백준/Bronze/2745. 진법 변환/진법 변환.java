import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String n = sc.next();
    	int b = sc.nextInt();
    	int tmp = 1;
    	int sum = 0;
    	for(int i = n.length() -1; i >= 0; i--) {
    		
    		if(n.charAt(i) >= 'A' && n.charAt(i) <= 'Z') {
    			
    			sum += (n.charAt(i) - 'A' + 10) * tmp;
    		}
    		else
    			sum += (n.charAt(i) - '0') * tmp;
    		
    		tmp *= b;
    	}
    	
    	System.out.println(sum);
    }
}