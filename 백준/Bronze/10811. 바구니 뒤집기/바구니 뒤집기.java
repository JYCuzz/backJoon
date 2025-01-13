import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
          
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int array[] = new int[n];
        
        for(int i = 1; i <= n; i++) {
        	
        	array[i-1] = i;
        }
        
        for(int a = 0; a < m; a++) {
        	
        	int i = sc.nextInt();
        	int j = sc.nextInt();
        	
        	for(i = i-1; i < j; i++) {
        		
        		int temp = array[i];
        		array[i] = array[j-1];
        		array[j-1] = temp;
        		j--;
        	}
        }
        
        for(int i = 0; i < array.length; i++) {
        	
        	System.out.print(array[i] + " ");
        }
    }
}