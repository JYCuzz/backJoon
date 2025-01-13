import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
    	String a = sc.next();
    	
    	String array[] = a.split("");
    	int sum = 0;
    	
    	for(int i = 0; i < array.length; i++) {
    		
    		if(array[i].equals("A") || array[i].equals("B") || array[i].equals("C"))
    			sum += 3;
    		else if(array[i].equals("D") || array[i].equals("E") || array[i].equals("F"))
    			sum += 4;
    		else if(array[i].equals("G") || array[i].equals("H") || array[i].equals("I"))
    			sum += 5;
    		else if(array[i].equals("J") || array[i].equals("K") || array[i].equals("L"))
    			sum += 6;
    		else if(array[i].equals("M") || array[i].equals("N") || array[i].equals("O"))
    			sum += 7;
    		else if(array[i].equals("P") || array[i].equals("Q") || array[i].equals("R") || array[i].equals("S"))
    			sum += 8;
    		else if(array[i].equals("T") || array[i].equals("U") || array[i].equals("V"))
    			sum += 9;
    		else if(array[i].equals("W") || array[i].equals("X") || array[i].equals("Y") || array[i].equals("Z"))
    			sum += 10;
    	}
    	
    	System.out.println(sum);

    }
}