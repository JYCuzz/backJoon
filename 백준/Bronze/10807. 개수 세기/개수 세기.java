import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
          
        int n = sc.nextInt();
        
        int array[] = new int[n];
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt();
        }
        
        int a = sc.nextInt();
        int count = 0;
        
        for(int i = 0; i < array.length; i++) {
        	
        	if(array[i] == a)
        		count++;
        }
        
        System.out.println(count);
    }
}