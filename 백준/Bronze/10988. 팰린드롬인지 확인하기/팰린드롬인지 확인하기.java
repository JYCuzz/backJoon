import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
    	String a = sc.next();
    	
    	String array [] = a.split("");
    	
    	int count = 0;
    	int b = array.length - 1;
    	
    	for(int i = 0; i < array.length; i++) {
    				
    		if(array[i].equals(array[b]) && b >= 0) {
    			
    			count++;
    			b--;
    		}
    	}
    	
    	if(count == a.length()) {
    		
    		System.out.println(1);
    	}
    	else
    		System.out.println(0);
    }
}