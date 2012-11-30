package com.googlecode.whiteprint.example.montyhall;

import java.util.logging.Logger;

import org.junit.Test;

public class TestMontyHall {

    Logger log = Logger.getLogger(MontyHall.class.getName());

    @Test
    public void testMontyHall() throws Exception {
	
	MontyHall montyHall = new MontyHall(1000);
	
	Result result = montyHall.call();
	
	log.info("won: " + result.getWon());
	log.info("swapped: " + result.getSwapped());
	log.info("won swapped: " + result.getWonAndSwapped());
	log.info("won stayed: " + result.getWonAndStayed());
	log.info("swap %win: "
		+ ((double) result.getWonAndSwapped() / (double) result.getSwapped() * 100f));
	log.info("stay %win: "
			+ ((double) result.getWonAndStayed() / (double) (1000 - result.getSwapped()) * 100f));

    }

}
