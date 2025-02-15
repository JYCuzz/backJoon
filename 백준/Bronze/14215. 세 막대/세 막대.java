import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int array[] = new int[3];
    	
    	for(int i = 0; i < 3; i++) {
    		int a = sc.nextInt();
    		array[i] = a;
    	}
    	
    	Arrays.sort(array);
    	
    	if(array[2] >= array[0] + array[1]) {
    		
    		array[2] = array[0] + array[1] -1;
    	}
    	
    	int sum = 0;
    	
    	for(int i = 0; i < 3; i++) {
    		
    		sum += array[i];
    	}
    	System.out.println(sum);
    }
}