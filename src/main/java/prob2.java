
/* 2. 번
1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, ...
위의 수열에서 2의 배수를 찾아 모두 더하는 함수를 작성하시오.
범위는 50번째 항까지 계산하도록 한다.
 */

public class prob2 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;

        int sum = 0;

        for(int i = 3; i < 50; i++) {
            arr[i] = arr[i-3] + arr[i-1];
        }

        for(int i = 0; i < 50; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("2의 배수에 해당하는 50번째 항까지 더한 값은: " + sum);
    }
}
