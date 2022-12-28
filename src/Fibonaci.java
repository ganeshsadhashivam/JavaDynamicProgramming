public class Fibonaci{
    public static void main(String[] args) {

        System.out.println(fibonaciRecursive(10));
    }

    private static long fibonaciRecursive(final int n){
        //F(n) = F(n-1) + F(n-2)
        if(n<2) return n;
        return  fibonaciRecursive(n-1) + fibonaciRecursive(n-2);
    }
}