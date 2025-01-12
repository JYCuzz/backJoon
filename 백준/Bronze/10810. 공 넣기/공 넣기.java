import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
          
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int array[] = new int[n];
        
        for(int i = 0; i < array.length; i++)
        	array[i] = 0;
        
        for(int a = 0; a < m; a++) {
        	
        	int i = sc.nextInt();
        	int j = sc.nextInt();
        	int k = sc.nextInt();
        	
        	for(; i <= j; i++) {
        		
        		array[i-1] = k;
        	}
        }
        
        for(int i = 0; i < array.length; i++) {
        	
        	if(i == array.length-1) {
        		System.out.print(array[i]);
        	}
        	else
        		System.out.print(array[i] + " ");
        }
    }
}