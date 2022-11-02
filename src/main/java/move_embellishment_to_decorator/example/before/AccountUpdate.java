package move_embellishment_to_decorator.example.before;

public class AccountUpdate {

    private final Account account;
    private final boolean isLegacyAccount;
    private final double monthlyFees;
    private final double legacyInterestRate;

    public AccountUpdate(Account account, boolean isLegacyAccount, double monthlyFees, double legacyInterestRate){
        this.account = account;
        this.isLegacyAccount = isLegacyAccount;
        this.monthlyFees = monthlyFees;
        this.legacyInterestRate = legacyInterestRate;
    }

    public void monthlyUpdate(){
        account.deduct(monthlyFees);
        if (isLegacyAccount){
            account.credit(legacyInterest(account));
        }
    }

    private double legacyInterest(Account account) {
        return account.balance() * legacyInterestRate;
    }
}
