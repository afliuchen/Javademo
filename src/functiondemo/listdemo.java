package functiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class listdemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,9);
        System.out.println(new listdemo().subsets(list));
    }
    public List<List<Integer>> subsets(List<Integer> list){
        if (list.isEmpty()){
            List<List<Integer>> ans=new ArrayList<>();
            ans.add(Collections.emptyList());
            return ans;
        }
        Integer fislt=list.get(0);
        List<Integer> reat=list.subList(1,list.size());
        List<List<Integer>> subans=subsets(reat);
        List<List<Integer>> subans2=insertAll(fislt,subans);
        return concat(subans,subans2);
    }
    static List<List<Integer>> insertAll(Integer fislt,List<List<Integer>> lists){
        List<List<Integer>> result=new ArrayList<>();
        for (List<Integer> list :lists){
            List<Integer> copylist=new ArrayList<>();
            copylist.add(fislt);
            copylist.addAll(list);
            result.add(copylist);
        }
        return result;
    }
    static List<List<Integer>> concat(List<List<Integer>> a,List<List<Integer>> b){
        List<List<Integer>> r=new ArrayList<>(a);
        r.addAll(b);
        return r;
    }
}
