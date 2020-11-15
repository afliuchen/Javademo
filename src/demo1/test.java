package demo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class test {
    public static void main(String[] args) {
        //BiFunction<String,Integer,Apple> c1=(color,weight)->new Apple(color,weight);
        BiFunction <String,Integer,Apple> c1=Apple::new;
        Apple a3=c1.apply("YELLOW",2);
        Apple a4=c1.apply("YELLOW",3);

        System.out.println(a3.getColor()+"   "+a3.getWeight());
        System.out.println(a4.getColor()+"   "+a4.getWeight());
        List<Apple> inev=new ArrayList<>();
        inev.add(a3);
        inev.add(a4);
      inev.sort(Comparator.comparing(Apple::getWeight));

    }
}
