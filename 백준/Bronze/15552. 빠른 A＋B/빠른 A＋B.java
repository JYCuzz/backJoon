import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
        Scanner sc = new Scanner(System.in);
          
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        
        int T = Integer.parseInt(bf.readLine());
        
        for(int i = 0; i < T; i++) {
        	st = new StringTokenizer(bf.readLine());
        	bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        
        bw.close();
        
    }
}