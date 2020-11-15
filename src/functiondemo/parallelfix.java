package functiondemo;

import java.util.Arrays;
import java.util.List;

public class parallelfix {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Arrays.fill(arr,1);
        Arrays.parallelPrefix(arr,(a, b)->a+b);
    }
}
