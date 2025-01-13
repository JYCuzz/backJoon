import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
          
        int n = sc.nextInt();
        double array[] = new double[n];
        int max = 0;
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt();
        	
        	if(array[i] > max)
        		max = (int)array[i];
        }
        
        for(int i = 0; i < array.length; i++) {
        	
        	array[i] = array[i] / max * 100;
        }
        
        double sum = 0;
        double avg = 0;
        
        for(int i = 0; i < array.length; i++) {
        	
        	sum += array[i];
        }
        
        avg = sum / n;
        
        System.out.println(avg);
    }
}