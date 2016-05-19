package extract_method.exercise;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> transactions = Arrays.asList(
                "1/1/16,10",
                "1/2/16,20",
                "1/3/16,-31",
                "1/4/16,DEAD",
                "1/5/16,20");
        BillCollector collector = new BillCollector();
        collector.process(transactions);

    }
}
