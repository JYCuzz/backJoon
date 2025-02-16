import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(bf.readLine());
    	
    	int array[] = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		array[i] = Integer.parseInt(bf.readLine());
    	}
    	
    	Arrays.sort(array);
    	
    	for(int i = 0; i < n; i++) {
    		sb.append(array[i]).append("\n");
    	}
    	
    	System.out.println(sb);
    }
}