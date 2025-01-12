import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
          
        int array[] = new int[9];
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt();
        }
        
        int max = 0;
        
        for(int i = 0; i < array.length; i++) {
        	
        	if(array[i] > max) {
        		max = array[i];
        	}
        }
        
        System.out.println(max);
        
        for(int i = 0; i < array.length; i++) {
        	
        	if(array[i] == max)
        		System.out.println(i+1);
        }
    }
}