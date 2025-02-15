import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int array[] = new int[3];
    	int sum = 0;
    	
    	for(int i = 0; i < array.length; i++) {
    		int a = sc.nextInt();
    		
    		array[i] = a;
    		sum += a;
    	}
    	
    	if(sum == 180) {
	    	if(array[0] == 60 && array[1] == 60 && array[2] == 60) {
	    		System.out.println("Equilateral");
	    	}
	    	else if(array[0] == array[1] && array[1] != array[2] && array[0] != array[2]) {
	    		System.out.println("Isosceles");
	    	}
	    	else if(array[0] != array[1] && array[1] != array[2] && array[0] == array[2]) {
	    		System.out.println("Isosceles");
	    	}
	    	else if(array[0] != array[1] && array[1] == array[2] && array[0] != array[2]) {
	    		System.out.println("Isosceles");
	    	}
	    	else if(array[0] != array[1] && array[1] != array[2] && array[0] != array[2]) {
	    		System.out.println("Scalene");
	    	}
    	}
    	else 
    		System.out.println("Error");
    }
}