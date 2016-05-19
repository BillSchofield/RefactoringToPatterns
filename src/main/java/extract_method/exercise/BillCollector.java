package extract_method.exercise;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class BillCollector {

    public void process(List<String> transactions) {
        int balance = 0;
        Date pastDueDate = null;
        Collections.sort(transactions);

        for (String transaction : transactions) {
            String[] tokens = transaction.split(",");
            if (tokens[1].equals("DEAD")){
                if (balance > 0) {
                    System.out.println("Send to collections");
                } else {
                    System.out.println("Close account and keep their money");
                }
            } else {
                DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
                Date date = null;
                try {
                    date = formatter.parse(tokens[0]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                System.out.println(date);
                int transactionAmount = Integer.parseInt(tokens[1]);
                balance += transactionAmount;
                int daysPastDue = 0;
                if (pastDueDate != null) {
                    daysPastDue = (int) ((date.getTime() - pastDueDate.getTime())
                            / (1000 * 60 * 60 * 24));
                }
                if (balance > 0) {
                    if (daysPastDue > 90) {
                        System.out.println("Send to collections");
                    } else {
                        System.out.println("Send bill for $" + balance);
                    }
                } else {
                    pastDueDate = null;
                    System.out.println("Thank customer for on time payment");
                }
            }
        }
    }
}
