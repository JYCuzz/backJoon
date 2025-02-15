import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int array1[] = new int[N];
    	int array2[] = new int[N];
    	
    	if(N == 1) {
    		System.out.println(0);
    		System.exit(0);
    	}
    	
    	for(int i = 0; i < N; i++) {
    		
    		array1[i] = sc.nextInt();
    		array2[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(array1);
    	Arrays.sort(array2);
    	
    	int width = array1[N-1] - array1[0];
    	int height = array2[N-1] - array2[0];
    	
    	System.out.println(width * height);
    }
}
