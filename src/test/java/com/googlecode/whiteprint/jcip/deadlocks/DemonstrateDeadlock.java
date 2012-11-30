package com.googlecode.whiteprint.jcip.deadlocks;

import java.util.Random;

import org.junit.Test;

import com.googlecode.whiteprint.jcip.deadlocks.unsafe.DynamicOrderDeadlock;

/**
 * DemonstrateDeadlock
 * <p/>
 * Driver loop that induces deadlock under typical conditions
 * 
 * @author Brian Goetz and Tim Peierls
 */
public class DemonstrateDeadlock {
    private static final int NUM_THREADS = 20;
    private static final int NUM_ACCOUNTS = 5;
    private static final int NUM_ITERATIONS = 1000000;

    @Test
    public void test() {
	final Random rnd = new Random();
	final Account[] accounts = new Account[NUM_ACCOUNTS];

	for (int i = 0; i < accounts.length; i++)
	    accounts[i] = new Account();

	class TransferThread extends Thread {
	    public void run() {
		for (int i = 0; i < NUM_ITERATIONS; i++) {
		    int fromAcct = rnd.nextInt(NUM_ACCOUNTS);
		    int toAcct = rnd.nextInt(NUM_ACCOUNTS);
		    DollarAmount amount = new DollarAmount(rnd.nextInt(1000));
		    try {
			DynamicOrderDeadlock.transferMoney(accounts[fromAcct],
				accounts[toAcct], amount);
		    } catch (InsufficientFundsException ignored) {
		    }
		}
	    }
	}
	for (int i = 0; i < NUM_THREADS; i++)
	    new TransferThread().start();
    }
}
