import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(bf.readLine());
    	
    	int cnt[] = new int[100001];
    	
    	for(int i = 0; i < n; i++) {
    		cnt[Integer.parseInt(bf.readLine())]++;
    	}
    	
    	for(int i = 0; i < 100001; i++) {
    		
    		while(cnt[i] > 0) {
    			sb.append(i).append("\n");
    			cnt[i]--;
    		}
    	}
    	
    	System.out.println(sb);
    }
}