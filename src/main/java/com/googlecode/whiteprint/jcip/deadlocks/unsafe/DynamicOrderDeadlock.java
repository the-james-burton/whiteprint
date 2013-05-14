package com.googlecode.whiteprint.jcip.deadlocks.unsafe;

import com.googlecode.whiteprint.jcip.deadlocks.Account;
import com.googlecode.whiteprint.jcip.deadlocks.DollarAmount;
import com.googlecode.whiteprint.jcip.deadlocks.InsufficientFundsException;

/**
 * DynamicOrderDeadlock
 * <p/>
 * Dynamic lock-ordering deadlock
 *
 * @author Brian Goetz and Tim Peierls
 */
public class DynamicOrderDeadlock {
    // Warning: deadlock-prone!
    public static void transferMoney(Account fromAccount,
                                     Account toAccount,
                                     DollarAmount amount)
            throws InsufficientFundsException {
        synchronized (fromAccount) {
            synchronized (toAccount) {
                if (fromAccount.getBalance().compareTo(amount) < 0)
                    throw new InsufficientFundsException();
                else {
                    fromAccount.debit(amount);
                    toAccount.credit(amount);
                }
            }
        }
    }


}
