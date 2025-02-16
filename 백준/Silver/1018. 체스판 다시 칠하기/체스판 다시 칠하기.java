import java.util.*;

public class Main {

	
	static int count = Integer.MAX_VALUE;
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	char array[][] = new char[n][m];
    	
    	for(int i = 0; i < n; i++) {	
    		String a = sc.next();
    		
    		for(int j = 0; j < m; j++) {
    			array[i][j] = a.charAt(j);
    		}
    	}
    	
    	for (int a = 0; a <= n - 8; a++) {
            for (int b = 0; b <= m - 8; b++) {
            	
                int checkW = 0;
                int checkB = 0;

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        char current = array[a + i][b + j];

                        if ((i + j) % 2 == 0) {
                        	
                            if (current != 'W') {
                            	checkW++;
                            }
                            
                            if (current != 'B') {
                            	checkB++;
                            }                     
                        } 
                        
                        else { 
                            if (current != 'B') {
                            	checkW++;
                            }
                            
                            if (current != 'W') {
                            	checkB++;
                            }
                        }
                    }
                }

                count = Math.min(count, Math.min(checkW, checkB));
            }
    	}
    	System.out.println(count);

    } 
}