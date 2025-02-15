import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	long a = sc.nextLong();
    	
    	ArrayList<Long> array = new ArrayList<>();
    	
    	while(a > 0) {
    		
    		int i = 0;
    		array.add(i, a % 10);
    		
    		a /= 10;
    	}
    	
    	Collections.sort(array);
    	
    	for(int i = array.size()-1; i >= 0; i--) {
    		
    		System.out.print(array.get(i));
    	}
    } 
}