import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	int n = Integer.parseInt(br.readLine());
    	
    	int array[][] = new int[n][2];
    	
    	for(int i = 0; i < n; i++) {
    		
    		st = new StringTokenizer(br.readLine());
    		array[i][0] = Integer.parseInt(st.nextToken());
    		array[i][1] = Integer.parseInt(st.nextToken());

    	}
    	
    	Arrays.sort(array, (e1, e2)->{
    		
    		if(e1[0] == e2[0]) {
    			return e1[1] - e2[1];
    		}
    		else {
    			return e1[0] - e2[0];
    		}
    	});
    			
    	
    	for(int i = 0; i < n; i++) {
    		
    			System.out.println(array[i][0] + " " + array[i][1]);
    	}
    }
}