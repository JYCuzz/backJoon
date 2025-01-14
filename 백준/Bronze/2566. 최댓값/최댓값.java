import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	int array[][] = new int[9][9];
    	int max = 0;
    	
    	for(int i = 0; i < array.length; i++) {
    		
    		for(int j = 0; j < array[i].length; j++) {
    			
    			array[i][j] = sc.nextInt();
    			
    			if(array[i][j] > max) {
    				max = array[i][j];
    			}
    		}
    	}
    	
    	for(int i = 0; i < array.length; i++) {
    		
    		for(int j = 0; j < array[i].length; j++) {
    					
    			if(array[i][j] == max) {
    				System.out.println(max);
    				System.out.println((i+1) + " " + (j+1));
    			}
    		}
    	}
    }
}