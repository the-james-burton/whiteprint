package com.googlecode.whiteprint.jcip.locks;

import java.util.concurrent.locks.Lock;

class Account {
    public Lock lock;

    void debit(DollarAmount d) {
    }

    void credit(DollarAmount d) {
    }

    DollarAmount getBalance() {
        return null;
    }
}