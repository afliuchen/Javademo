package demo7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,4,5,6,7,8,10,11,13,15);
        List<Integer> reult=numbers.stream()
                .peek(x-> System.out.println("当stream前值为： "+x))
                .map(x->x+17).peek(x-> System.out.println("map当前值为： "+x))
                .filter(x->x%2==0).peek(x->System.out.println("filter当前值为： "+x))
                .limit(3)
                .peek(x-> System.out.println("limit当前值为： "+x))
                .collect(Collectors.toList());
        System.out.println(reult);

    }
}
