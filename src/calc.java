import java.awt.geom.Point2D;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class calc {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).parallel().forEach(i -> {
            System.out.println(LocalDateTime.now() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        });

        /*List<Integer> ints= Arrays.asList(1,2,3,4,5,7,9);
        double average=calc1(ints);
    }
    private static double calc1(List<Integer> ints){
       double streamrequest=ints.stream()
               .map(i->new Point2D.Double((double)i%3,(double)i/3))
               .filter(point->point.getY()>1)
               .mapToDouble(point->point.distance(0,0))
               .average()
               .orElse(0);
       assert(average,is(streamrequest));
    }*/
    }
}