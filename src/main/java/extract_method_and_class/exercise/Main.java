package extract_method_and_class.exercise;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> sessions = Arrays.asList(
                "Dev,TDD by Example,60",
                "Dev,Refactoring to Patterns,120",
                "QA, JBehave for Fun and Profit,90");
        Conference conference = new Conference(9*60, 18*60);
        for (String session : sessions) {
            conference.addSession(session);
        }

        conference.print();

    }
}
