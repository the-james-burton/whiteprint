package com.design.concurrency.deadlocks;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
        private DollarAmount balance;
        private final int acctNo;
        private static final AtomicInteger sequence = new AtomicInteger();

        public Account() {
            acctNo = sequence.incrementAndGet();
        }

        public void debit(DollarAmount d) {
            balance = balance.subtract(d);
        }

        public void credit(DollarAmount d) {
            balance = balance.add(d);
        }

        public DollarAmount getBalance() {
            return balance;
        }

        public int getAcctNo() {
            return acctNo;
        }
    }