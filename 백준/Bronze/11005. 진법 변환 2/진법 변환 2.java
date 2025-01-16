import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int b = sc.nextInt();
    	int array[] = new int[32];
    	int i = 0;
    		
    	while (n > 0) {
    				
    		array[i++] = n % b;
    		
    		n /= b;
    	}
    	
    	for(int j = i -1; j >= 0; j--) {
    		
			if(array[j] >= 10) {
				System.out.print((char)(array[j] - 10 + 'A'));
			}
			else
				System.out.print(array[j]);
    		
    	}
    }
}