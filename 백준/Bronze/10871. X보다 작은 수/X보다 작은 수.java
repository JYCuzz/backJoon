import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
          
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        int array[] = new int[n];
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt();
        }
        
        for(int i = 0; i < array.length; i++) {
        	if(array[i] < x) {
        		System.out.print(array[i] + " ");
        	}
        }
    }
}