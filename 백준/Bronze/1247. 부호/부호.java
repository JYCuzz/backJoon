import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int test_case = sc.nextInt();

            // BigInteger를 사용
            BigInteger sum = BigInteger.ZERO;

            for (int j = 0; j < test_case; j++) {
                BigInteger a = sc.nextBigInteger();
                sum = sum.add(a); // BigInteger의 add 메서드 사용
            }

            if (sum.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else if (sum.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("-");
            } else {
                System.out.println("0");
            }
        }
    }
}