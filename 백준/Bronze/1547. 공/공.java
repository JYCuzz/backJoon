import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int test_case = sc.nextInt();
        
        int array[] = new int[] {1,2,3};
        
        for(int i = 0; i < test_case; i++) {
        	
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	
        	for(int j = 0; j < array.length; j++) {
        		
        		if(array[j] == x) {
        			array[j] = y;
        		}
        		else if(array[j] == y) {
        			array[j] = x;
        		}
        	}
        }
        System.out.println(array[0]);
    }
}