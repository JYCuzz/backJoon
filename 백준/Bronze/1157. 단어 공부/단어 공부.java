import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
    	String a = sc.next();
    	
    	a = a.toUpperCase();
    	
    	String b = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	
    	String array[] = b.split("");
    	int array1[] = new int[26];
    	String array2[] = a.split("");
    	
    	for(int i = 0; i < array1.length; i++) {
    		
    		array1[i] = 0;
    	}
    	
    	for(int i = 0; i < array2.length; i++) {
    		
    		for(int j = 0; j < array1.length; j++) {
    			
    			if(array2[i].equals(array[j])) {
    				
    				array1[j]++;
    			}
    		}
    	}
    	int max = 0;
    	
    	for(int i = 0; i < array1.length; i++) {
    		
    		if(array1[i] > max) {
    			
    			max = array1[i];
    		}
    	}
    	int count = 0;
    	
    	for(int i = 0; i < array1.length; i++) {
    		
    		if(array1[i] == max) {
    			count++;
    		}
    	}
    	
    	if(count > 1) {
    		System.out.println("?");
    		System.exit(0);
    	}
    	
    	for(int i = 0; i < array1.length; i++) {
    		
    		if(array1[i] == max) {
    			System.out.println(array[i]);
    		}
    	}
    }
}