/* 8번.
1 ~ 50 중에 3의 배수를 찾아 모든 값을 더한 결과를 출력하시오.
 */

public class prob8 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 51; i++) {
            if(i%3 == 0) {
                sum += i;
            }

        }
        System.out.println("3의 배수를 찾아 모든 값을 더한 결과는 : " + sum);
    }
}
