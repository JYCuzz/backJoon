import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	int sum = 1;
    	
    	for(int i = 0; i < a; i++) {
    		
    		sum = sum * 2;
    	}
    	
    	int result = (sum + 1) * (sum + 1);
    			
    	System.out.println(result);
    }
}
