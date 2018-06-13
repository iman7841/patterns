package patterns.model.proxy;

import patterns.iface.proxy.Bank;

public class BankImpl implements Bank {

    @Override
    public void withdrawMoney(int amount) {
        System.out.println(amount + " withdrawn");
    }
}
