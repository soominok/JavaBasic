
/* 1번.
1 ~ 100까지의 정수에서 짝수를 모두 뽑아내시오.
 */

public class prob1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i%2 == 0) {
                System.out.println(i + "는 짝수입니다.");
            }
        }

    }
}
