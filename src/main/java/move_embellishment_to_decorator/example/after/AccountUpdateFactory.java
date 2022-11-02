package move_embellishment_to_decorator.example.after;

public class AccountUpdateFactory {

    public static AccountUpdate createMonthlyFeesAccountUpdate(double fees){
        return new MonthlyFeesAccountUpdate(fees);
    }

    public static AccountUpdate createLegacyInterestAccountUpdate(double fees){
        AccountUpdate monthlyFeesAccountUpdate = new MonthlyFeesAccountUpdate(fees);
        return new LegacyInterestAccountUpdate(monthlyFeesAccountUpdate, 0.001);
    }

}
