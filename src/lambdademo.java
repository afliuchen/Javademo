import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lambdademo {
    public static void main(String[] args) {
        //创建一个启动线程
        //new Thread(()->System.out.println("启动")).start();
        /*提供supplier接口
        Supplier<String> stringSupplier=()->"OK";
        System.out.println(stringSupplier.get());
        */
        /*
        Predicate<Integer> predicate=i->1>0;
        Predicate<Integer> predicate1=i->i%2==0;
        assert(predicate.and(predicate1).test(2));
        */
        /*
        Consumer<String> prinln=System.out::println;
        prinln.andThen(prinln).accept("ddd创建一个新的输出d");
        */

    }

}
