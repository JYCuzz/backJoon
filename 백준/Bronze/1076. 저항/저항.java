import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String array[] = new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        
        String a[]= new String[3];
        
        long b = 0, c = 0;
		double d = 0, e = 0;

        for(int i = 0; i < 3; i++) {
        	
	        a[i] = sc.next();
	        
        }
        
        for(int i = 0; i < array.length; i++) {
        	
        	if(a[0].equals(array[i])) {
        		b = i;
        	}
        	
        	if(a[1].equals(array[i])) {
        		c = i;
        	}
        	if(a[2].equals(array[i])) {
        		d = Math.pow(10, i);
        		e = Math.pow(10, i+1);
        	}
        }
        
        b = b * (long)e;
        c = c * (long)d;
        
        System.out.println(b+c);
        
    }
}