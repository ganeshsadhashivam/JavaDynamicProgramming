import java.time.Duration;
import java.time.Instant;

public class Fibonaci{
    public static void main(String[] args) {


    for(int i=10;i<=50;i+=10){

        final Instant start = Instant.now();
        System.out.printf("fibonaci(%d)=%d%n",i,fibonaciRecursive(i));
        final long timeElapsed = Duration.between(start,Instant.now()).toMillis();
        System.out.printf("time taken %d ms%n%n", timeElapsed);
    }
    }

    //Time complexity
    //O(2^n)

    private static long fibonaciRecursive(final int n){
        //F(n) = F(n-1) + F(n-2)
        if(n<2) return n;
        return  fibonaciRecursive(n-1) + fibonaciRecursive(n-2);
    }
}