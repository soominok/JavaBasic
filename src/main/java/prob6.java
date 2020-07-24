/* 6번.
3 과 5 의 배수를 모두 출력하는 프로그램을 작성하시오.
중복 허용하지 않으며 범위는 1 ~ 100으로 잡는다.
 */

public class prob6 {
    public static void main(String[] args) {
        for(int i = 1; i < 101; i++) {
            if(i%3 == 0 & i%5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
