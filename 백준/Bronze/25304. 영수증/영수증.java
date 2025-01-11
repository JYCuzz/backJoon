import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        int n = sc.nextInt();
        int a = sc.nextInt();
        int sum = 0;
        
        for(int i = 0; i < a; i++) {
        	
        	int cost = sc.nextInt();
        	int num = sc.nextInt();
        	
        	sum += cost * num;
        }
        
        if(sum == n) {
        	System.out.println("Yes");
        }
        else
        	System.out.println("No");
    }
}