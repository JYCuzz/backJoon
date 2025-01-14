import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
 	
    	double sum = 0;
    	int count = 0;
    	double result = 0;
    	double sum1 = 0;
    	
    	for(int i = 0; i < 20; i++) {
    		
    		String subject = sc.nextLine();
    		
    		String array[] = subject.split(" ");
    		
    		if(array[2].equals("A+"))
    			sum += Double.parseDouble(array[1]) * 4.5;
    		else if(array[2].equals("A0"))
    			sum += Double.parseDouble(array[1]) * 4.0;
    		else if(array[2].equals("B+"))
    			sum += Double.parseDouble(array[1]) * 3.5;
    		else if(array[2].equals("B0"))
    			sum += Double.parseDouble(array[1]) * 3.0;
    		else if(array[2].equals("C+"))
    			sum += Double.parseDouble(array[1]) * 2.5;
    		else if(array[2].equals("C0"))
    			sum += Double.parseDouble(array[1]) * 2.0;
    		else if(array[2].equals("D+"))
    			sum += Double.parseDouble(array[1]) * 1.5;
    		else if(array[2].equals("D0"))
    			sum += Double.parseDouble(array[1]) * 1.0;
    		else if(array[2].equals("F"))
    			sum += Double.parseDouble(array[1]) * 0.0;
    		   		
    		if(!array[2].equals("P")) {
    			
    			sum1 += Double.parseDouble(array[1]);
    		}
    	}
    	
    	result = sum / sum1;
    	
    	System.out.println(result);
    }
}