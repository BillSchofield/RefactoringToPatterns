package move_embellishment_to_decorator.after;

import move_embellishment_to_decorator.before.Account;

public class LegacyInterestAccountUpdate implements AccountUpdate {
    private final AccountUpdate accountUpdate;
    private final double legacyInterestRate;

    public LegacyInterestAccountUpdate(AccountUpdate accountUpdate, double legacyInterestRate){
        this.accountUpdate = accountUpdate;
        this.legacyInterestRate = legacyInterestRate;
    }

    @Override
    public void update(Account account){
        accountUpdate.update(account);
        account.credit(account.balance() * legacyInterestRate);
    }
}
