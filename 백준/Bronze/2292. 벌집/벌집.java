import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	
    	int layer = 1;
    	int num = 0;
    	int edge = 1;
    	
    	while(num < n) {
    		
    		num++;
    		
    		if(num > edge) {
    			edge = edge + 6 * layer;
    			layer++;
    		}
    	}
    	
    	System.out.println(layer);
    	
    }
}