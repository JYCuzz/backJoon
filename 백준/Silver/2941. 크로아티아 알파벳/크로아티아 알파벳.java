import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
 	
    	String a = sc.next();
    	
    	int num = a.length();
    	
    	for(int i = 0; i < a.length(); i++) {
    		
    		if(i < a.length()-1) {
    			
    			if(a.charAt(i) == 'c' || a.charAt(i) == 's' || a.charAt(i) == 'z') {
    				
    				if(a.charAt(i+1) == '=') {
    					i++;
    					num--;
    				}
    			}
    			if(a.charAt(i) == 'c' || a.charAt(i) == 'd') {
    				
    				if(a.charAt(i+1) == '-') {
    					i++;
    					num--;
    				}
    			}
    			if(a.charAt(i) == 'l' || a.charAt(i) == 'n') {
    				
    				if(a.charAt(i+1) == 'j') {
    					i++;
    					num--;
    				}
    			}
    		}
    		
    		if(i < a.length() -2) {
    			
    			if(a.charAt(i) == 'd' && a.charAt(i+1) == 'z' && a.charAt(i+2) == '=') {
    				i += 2;
    				num -= 2;
    			}
    				
    		}
    	}
    	System.out.println(num);
    }
}