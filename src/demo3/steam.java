package demo3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class steam {
    public enum  Cols{DEF,NOT,FAT};
    public static void main(String[] args) {
    List<Dish> menu= Arrays.asList(
            new Dish("pack",false,800,Dish.Type.MEAT),
            new Dish("beef",false,700,Dish.Type.MEAT),
            new Dish("bdock",true,600,Dish.Type.MEAT),
            new Dish("dcii",false,300,Dish.Type.OTHER),
            new Dish("dv",true,800,Dish.Type.OTHER),
            new Dish("dfs",false,700,Dish.Type.OTHER),
            new Dish("svsb",true,90,Dish.Type.OTHER),
            new Dish("weq",true,500,Dish.Type.FISH),
            new Dish("qrw",false,200,Dish.Type.FISH),
            new Dish("uyyt",false,100,Dish.Type.FISH)
    );

   Map<Dish.Type, Map<Cols,List<Dish>>> listMap2=menu.stream().collect(
            groupingBy(Dish::getType,groupingBy(dish->{
                if(dish.getCalories()<=400) return Cols.DEF;
                else if(dish.getCalories()<=700) return Cols.NOT;
                else return Cols.FAT;
            })));
        Map<Dish.Type, Set<Cols>> listMap5=menu.stream().collect(
                groupingBy(Dish::getType,mapping(dish->{
                    if(dish.getCalories()<=400) return Cols.DEF;
                    else if(dish.getCalories()<=700) return Cols.NOT;
                    else return Cols.FAT;
                },toSet())));
        System.out.println("list5="+listMap5);
        System.out.println("list2"+listMap2);
        Map<Dish.Type,Long> map1=menu.stream().collect(groupingBy(Dish::getType,counting()));
        System.out.println("map1="+map1);
        Map<Dish.Type,List<Dish>> listMap3=menu.stream().collect(
                groupingBy(Dish::getType,filtering(dish->dish.getCalories()<500,toList()))
        );
        System.out.println("list3"+listMap3);

        Map<Dish.Type,List<Dish>> listMap=menu.stream().collect(groupingBy(Dish::getType));
        System.out.println(listMap);


        Comparator<Dish> dishComparator=Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostdish=menu.stream().collect(maxBy(dishComparator));
        System.out.println(mostdish);

        int todisnsums=menu.stream().collect(summingInt(Dish::getCalories));
        System.out.println(todisnsums);

        IntSummaryStatistics intSummaryStatistics=menu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println(intSummaryStatistics);

        String joins=menu.stream().map(Dish::getName).collect(joining(" ,"));
        System.out.println(joins);

    OptionalInt cosums=menu.stream()
            .mapToInt(Dish::getCalories)
            .max();

    Map<Boolean,List<Dish>> listMap6=menu.stream().collect(partitioningBy(Dish::isVegetarian));
        System.out.println("list6="+listMap6);
        List<Dish> dishes=listMap6.get(true);
        System.out.println("dishes="+dishes);
     //   System.out.println(cosums);
    /*List<String> threacolorname=menu.stream()//从menu中获取流
            .filter(dish -> dish.getCalories()>300)//建立操作流水线，取出高于300的数据
            .map(Dish::getName)//获取菜名  dish -> dish.getName()
            .limit(4)//选择头4个
            .collect(Collectors.toList());//将数据结果保存到另一个List中
        System.out.println(threacolorname);
       // threacolorname.forEach(System.out::println);
        threacolorname.forEach(System.out::println);*/

       /* List<String> vermenu=menu.stream()
                .dropWhile(dish -> dish.getCalories()>320)
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(vermenu);*/


        List<Integer> numbers1=Arrays.asList(1,2,4,2,1,7,8);
       numbers1.stream()
               .filter(i->i%2==0)
               //.distinct()
               .collect(Collectors.toSet())
               .forEach(System.out::println);

        //String[] arraydemos={"Hello","Word"};
       // Stream<String> words=Arrays.stream(arraydemos);
      /* List<String> words=Arrays.asList("Hello","Word");
        List<String> unchars=
       words.stream()
               .map(word->word.split(""))
               .flatMap(Arrays::stream)
               .distinct()
               .collect(Collectors.toList());
        System.out.println(unchars);*/

     /* if (menu.stream().anyMatch(Dish::isVegetarian)){
          System.out.println("有素食产品");
      }*/
       /* Optional<Dish> dish=menu.stream()
                .filter(dish1 -> dish1.getCalories()<1000)
                .findAny();
        System.out.println(dish);*/
       int a=4;
       int b=6;
       List<Integer> numbers=Arrays.asList(a,b);
       int sum=numbers.stream().reduce(8,Integer::max);
       // System.out.println(sum);
        long lens=menu.stream().count();
       // System.out.println(lens);
    }
}
