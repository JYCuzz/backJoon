import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	char array[][] = new char[5][15];
    	
    	for(int i = 0; i < array.length; i++) {
    		
    		String a = sc.next();
    		
    		for(int j = 0; j < a.length(); j++) {
    			
    			array[i][j] = a.charAt(j);
    		}
    	}
    	
    	for(int j = 0; j < 15; j++) {
    		for(int i = 0; i < 5; i++) {
    			
    			if(j < array[i].length && array[i][j] != '\0') {
    				System.out.print(array[i][j]);
    			}
    		}
    	}
    }
}