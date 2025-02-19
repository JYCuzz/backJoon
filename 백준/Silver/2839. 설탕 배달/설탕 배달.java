import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = sc.nextInt();
    	int count = 0;
    	
    		
		while(n > 0) {
			
			if(n % 5 == 0) {
				count += n / 5;
				break;
			}
			else
				n -= 3;
				count++;
			
			if(n < 0) {
				count = -1;
			}
		}
		
    	System.out.println(count);
    }
}