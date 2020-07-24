/*
배열없이 문제 풀기
 */

// Non Array Version
// 메모리를 덜 사용함. 하지만 생각을 많이 해야 함.
// 1 1 2 3 5 8 13
class Fib {
    int first;
    int second;
    private int res;

    final int START = 2;

    public int calcNFib(int n) {
        int tmp;

        first = 1;
        second = 1;
        res = 0;

        if(n < 2) {
            return 1;
        }

        // first + second = res
        // second + res   = next_res
        // res + next_res = nn_res
        // 한 칸씩 밀려나고 있음!
        for(int i = START; i < n; i++) {
            tmp = first;
            // 다음 연산에서 second가 되기 때문에 first에 넣어준 것.
            first = second;
            // 여기서 tmp는 second가 되는 것.
            res = first + tmp;
            // 다음 연산에서 res값이 second 자리에 있음.
            second = res;
        }
        return res;
    }
}


public class prob4_nonarr {
    public static void main(String[] args) {
        Fib fib = new Fib();
        // 1 1 2 3 5 8 13 21 34 55
        System.out.println(fib.calcNFib(3));
        System.out.println(fib.calcNFib(5));
        System.out.println(fib.calcNFib(6));
        System.out.println(fib.calcNFib(8));

    }
}
