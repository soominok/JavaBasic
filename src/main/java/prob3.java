
/* 3번.
1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, ...
위와 같은 수열의 30번째 항을 구하는 프로그램을 작성하시오.
 */

public class prob3 {
    public static void main(String[] args) {
        int [] arr = new int[30];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;

        int p3 = 0;

        for(int i = 3; i < 30; i++) {
            arr[i] = arr[i-3] + arr[i-1];
            // System.out.print(arr[i]);
        }

        for(int i = 0; i < 30; i++) {
            p3 = arr[i];
            System.out.println(p3);
        }

        System.out.println("30번째 항의 값은 : " + p3);


    }


}
