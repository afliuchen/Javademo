package demo4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Traders {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> test1 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        //  System.out.println(test1);
        List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
        List<String> test2 = traders.stream().map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
        // System.out.println(test2);'
        boolean test3=traders.stream()
                .anyMatch(trader -> trader.getCity().equals("Milan"));
        System.out.println(test3);

    }
}
