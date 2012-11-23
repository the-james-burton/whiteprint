package com.design.example.montyhall;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

public class MontyHall implements Callable<Result>{
   
    private final int iterations;
    
    public MontyHall(int iterations) {
	this.iterations = iterations;
    }
    
    @Override
    public Result call() throws Exception {

	Result result = new Result();

	int done = 0;

	Logger log = Logger.getLogger(MontyHall.class.getName());

	while (done++ < iterations) {
	    Person punter = new Person("punter");
	    Person host = new Person("host");
	    Puzzle puzzle = new Puzzle(host);

	    // punter choose a door...
	    Random random = new Random();
	    int choice = random.nextInt(3);
	    Door punterDoor = puzzle.getDoor(choice);
	    punter.setDoor(punterDoor);
	    log.info("punter:" + punterDoor.getNumber());

	    // host opens an empty door...
	    Door hostDoor = puzzle.getNonPrizeNonPunterDoor();
	    host.setDoor(hostDoor);
	    log.info("host:" + hostDoor.getNumber());
	    hostDoor.open();
	    if (hostDoor.isPrize()) {
		log.fine("door " + hostDoor.getNumber()
			+ " has the prize! Game void!");
		break;
	    }

	    // punter switches doors
	    Door alternativeDoor = puzzle.getAlternativeDoor();
	    if (random.nextBoolean()) {
		log.info("punter has decided to switch to door "
			+ alternativeDoor.getNumber());
		punter.setDoor(alternativeDoor);
		punter.setSwapped();
		log.info("switch:" + alternativeDoor.getNumber());
		result.swapped();
	    } else {
		log.info("punter has decided to stay at door "
			+ punter.getDoor().getNumber());
		log.info("stay:" + punter.getDoor().getNumber() + ",");
	    }

	    // has the punter won?
	    if (punter.getDoor().isPrize()) {
		punter.setWon();
		result.won();
	    }
	    log.info(Boolean.toString(punter.isWon()));

	    // results
	    // log.info(won + "," + switched);

	    if (punter.isWon()) {
		if (punter.isSwapped()) {
		    result.wonAndSwapped();
		} else {
		    result.wonAndStayed();
		}
	    }

	}

	return result;
    }


}
