package move_embellishment_to_decorator.example.after;

import move_embellishment_to_decorator.example.before.Account;

public class MonthlyFeesAccountUpdate implements AccountUpdate {
    private final double monthlyFees;

    public MonthlyFeesAccountUpdate(double monthlyFees){
        this.monthlyFees = monthlyFees;
    }

    @Override
    public void update(Account account){
        account.deduct(monthlyFees);
    }
}
