import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++) {
        	
        	String a = sc.next();
        	System.out.println(a.charAt(0) + "" + a.charAt(a.length()-1));
        	
        }    
    }
}