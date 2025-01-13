import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
          
        int array[] = new int[10];
        boolean confirm [] = new boolean[42];
        		
        for(int i = 0; i < array.length; i++) {
        	
        	int a = sc.nextInt();
        	
        	array[i] = a % 42;
        	
        	confirm[a%42] = true;
        }
        
        int count = 0;
        
        for(int i = 0; i < confirm.length; i++) {
        	
        	if(confirm[i] == true) {
        		count++;
        	}
        }
        System.out.println(count);
    }
}