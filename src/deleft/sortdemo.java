package deleft;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortdemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,6,8,9,2,4,45,21);
        list.sort(Comparator.naturalOrder());
        System.out.println(list );
    }
}
