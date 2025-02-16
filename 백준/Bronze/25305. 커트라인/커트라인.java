import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    
    	int array[] = new int[n];

    	
    	StringTokenizer sb = new StringTokenizer(bf.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		array[i] = Integer.parseInt(sb.nextToken());
    	}
    	
    	Arrays.sort(array);
    	
    	int count = 0;
    	
    	for(int i = n-1; i >= 0; i--) {
    		
    		count++;
    		
    		if(count == k) {
    			System.out.println(array[i]);
    		}
    	}
    }
}