package demo6;

import java.util.*;

public class listadd {
    public static void main(String[] args) {
        List<String> lists=List.of("元素一","元素二","元素三");
      //  lists.add("元素四");
        //lists.remove(1);
      //  System.out.println(lists);


        Set<String> sets=Set.of("元素一","元素二","元素三");
       // sets.add("元素四");
      //  System.out.println(sets);
        List<String> list2=new ArrayList<>();
        list2.add("元素一");
       // System.out.println(list2);
        Map<String,Integer> maps=Map.ofEntries(Map.entry("元素一",1),
                                                Map.entry("元素九",9),
                                             Map.entry("元素四",4),
                                            Map.entry("元素八",8),
                                                Map.entry("元素三",3));
        Map<String,Integer> maps3=Map.ofEntries(Map.entry("元素1",1),
                Map.entry("元素3",9),
                Map.entry("元素5",4),
                Map.entry("元素8",8),
                Map.entry("元素9",3));
        Map<String,Integer> maps4=new HashMap<>(maps3);
        maps4.putAll(maps);
       // System.out.println(maps4);
       // maps.replace("元素一",1);
      //  maps.entrySet().stream().sorted(Map.Entry.comparingByValue())
             //   .forEachOrdered(System.out::println);

       // System.out.println(maps.getOrDefault("元素一",5));
     //   System.out.println(maps);
        Map<String,Integer> maps2=new HashMap<>();
        maps2.put("元素一",5);
        maps2.put("元素二",50);
        maps2.put("元素三",20);
        maps2.entrySet().removeIf(entry->entry.getValue()<10);
        System.out.println(maps2);
      //  maps2.replaceAll((friend,movis)->movis.toUpperCase());
    }
}
