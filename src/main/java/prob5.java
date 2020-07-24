/* 5번.
1 ~10의 범위에서 3의 배수는 더한다.
3으로 나눠 나머지가 1인 숫자는 곱한다.
3으로 나눠 나머지가 2인 숫자는 뺀다.
각각을 연산하면 모두 더한 값을 계산하시오.
 */

public class prob5 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                sum += i;

            } else if (i % 3 == 1) {
                sum *= i;
            } else {
                sum -= i;
            }
        }
        System.out.println("모두 더한 값은 : " + sum++);
    }
}



