package functiondemo;

public class fac {
    public static void main(String[] args) {
        System.out.println(new fac().factorTail(4));
    }
    public static long factorTail(long n){
        return FacHello(1,n);
    }

    private static long FacHello(long i, long n) {
        return n==1 ? i : FacHello( i*n,n-1);
    }
}
