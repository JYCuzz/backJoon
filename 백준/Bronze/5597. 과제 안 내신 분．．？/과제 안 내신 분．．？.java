import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
          
        int array[] = new int[30];
        
        for(int i = 1; i <= array.length; i++) {
        	array[i-1] = i;
        }
        
        for(int i = 0; i < 28; i++) {
        	
        	int a = sc.nextInt();
        	
        	for(int j = 0; j < 30; j++) {
        		
        		if(array[j] == a)
        			array[j] = 0;
        	}
        }
        
        for(int i = 0; i < 30; i++) {
        	
        	if(array[i] != 0) {
        		System.out.println(i+1);
        	}
        }
    }
}