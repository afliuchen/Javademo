package demo5;

import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {

        System.out.println(new test().seqsum(20L));

    }
    public long seqsum(long n){
        return Stream.iterate(1L,i->i+1).limit(n).parallel().reduce(0L,Long::sum);

    }
}
