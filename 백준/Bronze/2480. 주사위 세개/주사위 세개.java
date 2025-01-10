import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = 0;
        int array[] = new int[] {a, b, c};
        
        for(int i = 0; i < array.length; i++) {
        	if(array[i] >= max) {
        		max = array[i];
        	}
        }
        
        if(a == b && a == c && b == c) {
        	System.out.println(10000 + a * 1000);
        }
        else if(a == b && a != c && b != c) {
        	System.out.println(1000 + a * 100);
        }
        else if(a == c && b != c && a != b) {
        	System.out.println(1000 + a * 100);
        }
        else if(b == c && a != c && a != b) {
        	System.out.println(1000 + c * 100);
        }
        else if (a != b && a != c && b != c)
        	System.out.println(max * 100);
    }
}