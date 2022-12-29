import java.time.Duration;
import java.time.Instant;

public class Fibonaci{
    public static void main(String[] args) {


    for(int i=10;i<=50;i+=10){

        final Instant start = Instant.now();
        //System.out.printf("fibonaci(%d)=%d%n",i,fibonaciRecursive(i));
        /* output using fibonaciRecursive
        fibonaci(10)=55
        time taken 15 ms

        fibonaci(20)=6765
        time taken 0 ms

        fibonaci(30)=832040
        time taken 0 ms

        fibonaci(40)=102334155
        time taken 351 ms

        fibonaci(50)=12586269025
        time taken 38188 ms

         */

       // System.out.printf("fibonaci(%d)=%d%n",i,fibonaciTopDown(i));
        /* output using fibonaciTopDown
        fibonaci(10)=55
        time taken 23 ms

        fibonaci(20)=6765
        time taken 0 ms

        fibonaci(30)=832040
        time taken 0 ms

        fibonaci(40)=102334155
        time taken 0 ms

        fibonaci(50)=12586269025
        time taken 0 ms
         */

        System.out.printf("fibonaci(%d)=%d%n",i,fibonaciBottomUp(i));
        /* output using fibonaciBottomUp
        fibonaci(10)=55
        time taken 16 ms

        fibonaci(20)=6765
        time taken 0 ms

        fibonaci(30)=832040
        time taken 0 ms

        fibonaci(40)=102334155
        time taken 0 ms

        fibonaci(50)=12586269025
        time taken 0 ms

         */
        final long timeElapsed = Duration.between(start,Instant.now()).toMillis();
        System.out.printf("time taken %d ms%n%n", timeElapsed);
    }
    }

    //time complexity
    // O(n)
    private static long fibonaciBottomUp(final int n){
        if(n<2) return n;
        final long[] dp = new long[n];
        dp[0]=0;
        dp[1] = 1;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1] + dp[i - 2];

        }
        return dp[n-1] + dp[n-2];
    }

    private static long fibonaciTopDown(final int n){
        return fibonaciTopDownHelper(n,new long[n+1]);
    }

    //O(n)
    private static long fibonaciTopDownHelper(final int n , final long[] memo){
        if(n<2) return n;
        if(memo[n] == 0){
           memo[n] = fibonaciTopDownHelper(n-1,memo) + fibonaciTopDownHelper(n-2,memo);
        }
        return memo[n];
    }

    //Time complexity
    //O(2^n)

    private static long fibonaciRecursive(final int n){
        //F(n) = F(n-1) + F(n-2)
        if(n<2) return n;
        return  fibonaciRecursive(n-1) + fibonaciRecursive(n-2);
    }
}