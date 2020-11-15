package demo4;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamint {
    public static void main(String[] args) {
        IntStream evesizes=IntStream.rangeClosed(1,100)
                .filter(i->i%2==0);
        //System.out.println(evesizes.count());

        Stream<int[]> test4=IntStream.rangeClosed(1,100)
                .boxed().flatMap(a->IntStream.rangeClosed(a,100)
                .filter(b->Math.sqrt(a*a+b*b)%1==0)
                        .mapToObj(b->new int[]{a,b,(int)Math.sqrt(a*a+b*b)}));
      //  test4.limit(5).forEach(t->System.out.println(t[0]+"  "+t[1]+"  "+t[2]));

       Stream<String> stream=Stream.of("tes1","tes2","tes3");
       //stream.map(String::toUpperCase).forEach(System.out::println);


        long uniques=0;
        try(Stream<String> lines= Files.lines(Paths.get("/data.txt"), Charset.defaultCharset())){
            uniques=lines.flatMap(line-> Arrays.stream(line.split(" ")))
                    .distinct().count();
        }catch (IOException e){
            e.printStackTrace();
        }
       // System.out.println(uniques);
        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(20)
                .forEach(t->System.out.println(t[0]));
    }
}
