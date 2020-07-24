
/* 4번.
피보나치 수열의 n번째 항을 구하는 프로그램을 작성하시오.
*/

public class prob4 {
    public static void main(String[] args) {
        int [] fibo = new int[30];
        fibo[0] = 1;
        fibo[1] = 1;

        int fibo0 = 0;
        int tmp = 0;

        for(int i = 2; i < 30; i++) {
            fibo[i] = fibo[i-2] + fibo[i-1];

        }

        for(int i = 0; i < 30; i++) {
            tmp++;
            fibo0 = fibo[i];
            System.out.println(tmp + "번째 항의 값 : " + fibo0);
        }


    }
}
