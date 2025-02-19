import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = sc.nextInt();
    	int count = 1;
    	int num = 666;
    	
    	while(count != n) {
    		
    		num++;
    		
    		if(String.valueOf(num).contains("666")) {
    			count++;
    		}
    	}
    		
    	System.out.println(num);
    }
}