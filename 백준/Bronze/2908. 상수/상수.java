import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        String array1[] = a.split("");
        String array2[] = b.split("");
        
        int c = 100;
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i = a.length()-1; i >= 0; i--) {
        	
        	sum1 = sum1 + Integer.parseInt(array1[i]) * c;
        	sum2 = sum2 + Integer.parseInt(array2[i]) * c;
        	c /= 10;
        }
        
        if(sum1 > sum2) {
        	System.out.println(sum1);
        }
        else
        	System.out.println(sum2);

    }
}