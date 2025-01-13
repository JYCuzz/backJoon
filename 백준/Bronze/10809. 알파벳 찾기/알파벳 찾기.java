import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
    	int array[] = new int[26];
    	
    	for(int i = 0; i < array.length; i++)
    		array[i] = -1;
    	
    	String s = sc.next();
    	String alpabet = "abcdefghijklmnopqrstuvwxyz";
    	String array1[] = s.split("");
    	String array2[] = alpabet.split("");
    	
    	for(int i = 0; i < array2.length; i++) {
    		
    		for(int j = 0; j < array1.length; j++) {
    			
    			if(array2[i].equals(array1[j]) && array[i] == -1) {
    				
    				array[i] = j;
    			}
    		}
    	}
    	
    	for(int i = 0; i < array.length; i++) {
    		System.out.print(array[i] + " ");
    	}
    }
}
