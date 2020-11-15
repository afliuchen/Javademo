package demo3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Interdemo {
    public static void main(String[] args) {
        List<Integer> integers1= Arrays.asList(1,2,3);
        List<Integer> integers2=Arrays.asList(4,5);
        List<int[]> ints=integers1.stream()
                .flatMap(i->integers2.stream().map(j -> new int[]{i,j}))
                .collect(Collectors.toList());
        System.out.print(Arrays.toString(new List[]{ints}));
       /* List<int[]> ints=integers1.stream()
                .flatMap(i->integers2.stream()
                .filter(j->(i+j)%3==0)
                .map(j->new int[]{i,j}))
                .collect(Collectors.toList());
        System.out.println(ints);*/
    }
}
