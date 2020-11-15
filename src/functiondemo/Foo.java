package functiondemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Foo {
    public static void main(String[] args) {

       // IntStream.rangeClosed(2,6).forEach(n-> System.out.println("Hello"+n+"次执行！"));
        Function<String,Boolean> isenity=(String s)->s.length()>60;
      boolean long1=  isenity.apply("A cjsdjvkkjvsduih s是是黑个护肤的规划hi戹  发崔 符合吃饭饭反对和女方j!");
       // System.out.println(long1);

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        numbers.replaceAll(n->n*2);
        System.out.println(numbers);
    }
}
