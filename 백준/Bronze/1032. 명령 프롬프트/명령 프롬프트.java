import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		String array[] = new String[test_case];
		
		for(int i = 0; i < test_case; i++) {
			
			array[i] = sc.next();
		}
		
		
		for(int i = 1; i < test_case; i++) {
			
			char[] temp = array[0].toCharArray();
			
			for(int j = 0; j < array[i].length(); j++) {
				if(temp[j] != array[i].charAt(j)) {
					
					temp[j] = '?';
				}
			}
			array[0] = new String(temp);
			
		}
		System.out.println(array[0]);
	}
}