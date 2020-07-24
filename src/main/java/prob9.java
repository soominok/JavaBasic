/* 9번.
1 ~ 50 중에 2의 배수를 찾아서 출력하시오.
 */

public class prob9 {
    public static void main(String[] args) {
        for(int i = 1; i < 51; i++) {
            if(i%2 == 0) {
                System.out.println("1~50 중에 2의 배수의 값");
                System.out.println(i);
            }
        }
    }
}
