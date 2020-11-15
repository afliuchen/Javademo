import java.util.function.Function;

public class demo2 {
    public static void main(String[] args) {
        Function<String,String> addHeader=demo2::addHeader;
        Function<String, String> springme=addHeader.andThen(demo2::cleck).andThen(demo2::addFooder);
        String a=springme.apply("啦啦啦");
        System.out.println(a);
    }
    public static String addHeader(String text){
        return "fool model,sss"+text;
    }
    public static String addFooder(String text){
        return "fool model,aaa"+text;
    }
    public static String cleck(String text){
        return "fool model,bbb"+text;
    }

}
