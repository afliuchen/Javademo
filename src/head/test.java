package head;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class test {
    public static void main(String[] args) {
        UnaryOperator<String> headerPocessing=(String text)->"From reult Alan and Moin: "+text;
        UnaryOperator<String> SpeCheckerpossing=(String text)->text.replaceAll("labda","lambdas");
        Function<String,String> pipeine=headerPocessing.andThen(SpeCheckerpossing);
        String reult=pipeine.apply("Aren labda really sexy??!");
        System.out.println(reult);
    }
}
