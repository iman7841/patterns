package patterns;

import patterns.iface.proxy.Bank;
import patterns.model.proxy.BankImpl;

public class Proxy implements Bank {

    public Bank bank;

    public boolean isBalanceAvailable(int amount) {
        if (amount > 10000) {
            return false;
        }
        return true;
    }

    @Override
    public void withdrawMoney(int amount) {
        bank = new BankImpl();
        if (isBalanceAvailable(amount)) {
            bank.withdrawMoney(amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
