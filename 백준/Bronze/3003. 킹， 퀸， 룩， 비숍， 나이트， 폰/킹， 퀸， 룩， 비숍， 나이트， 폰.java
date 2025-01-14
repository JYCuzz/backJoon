import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
    	int a = 1;
    	int b = 2;
    	int c = 8;
    	
    	int array[] = new int[6];
    	
    	for(int i = 0; i < array.length; i++) {
    		
    		array[i] = sc.nextInt();
    	}
    	
    	for(int i = 0; i < 2; i++) {
    		
    		if(array[i] > a) {
    			System.out.print("-" + (array[i] - a) + " ");
    		}
    		else 
    			System.out.print(a - array[i] + " ");
    	}
    	
    	for(int i = 2; i < 5; i++) {
    		
    		if(array[i] > b) {
    			System.out.print("-" + (array[i] - b) + " ");
    		}
    		else 
    			System.out.print(b - array[i] + " ");
    	}
    	
    	if(array[5] > c) {
    		System.out.print("-" + (array[5] - c) + " ");
    	}
    	else
    		System.out.print(c - array[5] + " ");
    	
    }
}