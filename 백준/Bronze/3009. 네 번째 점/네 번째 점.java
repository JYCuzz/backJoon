import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int array1[] = new int[3];
    	int array2[] = new int[3];
    	
    	for(int i = 0; i < 3; i++) {
    		array1[i] = sc.nextInt();
    		array2[i] = sc.nextInt();
    	}
    	
    	int a = 0;
    	int b = 0;
    	
    	if(array1[0] == array1[1]) {
    		a = array1[2];
    	}
    	else if(array1[0] == array1[2]) {
    		a = array1[1];
    	}
    	else
    		a = array1[0];
    	
    	if(array2[0] == array2[1]) {
    		b = array2[2];
    	}
    	else if(array2[0] == array2[2]) {
    		b = array2[1];
    	}
    	else
    		b = array2[0];
    	
    	System.out.println(a + " " + b);
    }	 
}