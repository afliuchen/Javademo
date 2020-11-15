import java.io.BufferedReader;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
       //Main mian=new Main();
        //String str="abc";
        Function<Integer,Integer> a=x->x+1;
        Function<Integer,Integer> b=x->x*2;
        Function<Integer,Integer> c=a.andThen(b);
       int d= c.apply(2);
        System.out.println(d);
     //new  Thread(()-> System.out.println(mian.test("abc"))).start();
         //new Thread(()->System.out.println("Hello World!")).start();
        //(int a,int b) -> a*b

        //System.out.println();
    }
public String test(String str){
        return  new StringBuffer(str).reverse().toString();
}
}
