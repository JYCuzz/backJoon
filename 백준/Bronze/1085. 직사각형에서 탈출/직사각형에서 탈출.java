import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int a = (int) Math.sqrt(((w-x) * (w-x)) + ((h-y) * (h-y)));
		int b = (int) Math.sqrt(((0-x) * (0-x)) + ((0-y) * (0-y)));
		int c = (int) Math.sqrt(((w-x) * (w-x)));
		int d = (int) Math.sqrt(((h-y) * (h-y)));
		int e = (int) Math.sqrt(((0-x) * (0-x)));
		int f = (int) Math.sqrt(((0-y) * (0-y)));
		
		int min = (int) Math.sqrt((w * w) + (h * h));;
		
		if(min >= a) {
			min = a;
		}
		if(min >= b) {
			min = b;
		}
		if(min >= c) {
			min = c;
		}
		if(min >= d) {
			min = d;
		}
		if(min >= e) {
			min = e;
		}
		if(min >= f) {
			min = f;
		}
		
		System.out.println(min);
	}
}