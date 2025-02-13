import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	int count = 0;
    	int array[] = new int[N];
    	
    	for(int i = 1; i <= N; i++) {
    		
    		if(N % i == 0) {
    			array[count++] = i;
    		}
    	}
    	
    	if(count < K) {
    		System.out.println(0);
    	}
    	else {
    		System.out.println(array[K-1]);
    	}
    }
}