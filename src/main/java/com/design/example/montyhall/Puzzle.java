package com.design.example.montyhall;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class Puzzle {

    private final Logger log = Logger.getLogger(Puzzle.class.getName());

    private List<Door> doors = new ArrayList<Door>();

    public Puzzle(Person host) {
	log.fine("creating new puzzle");
	Random random = new Random();

	doors.add(new Door(1));
	doors.add(new Door(2));
	doors.add(new Door(3));

	int prizedoor = random.nextInt(3);
	doors.get(prizedoor).addPrize();
	System.out.print("prize:" + (prizedoor + 1) + ",");

    }

    public Door getDoor(int index) {
	return doors.get(index);
    }

    public Door getAlternativeDoor() {
	Door result = null;
	for (Door door : doors) {
	    if (door.getPunter() == null && !door.isOpen()) {
		result = door;
	    }
	}
	return result;
    }

    public Door getNonPrizeNonPunterDoor() {
	Door result = null;
	for (Door door : doors) {
	    if (door.getPunter() == null && !door.isPrize()) {
		result = door;
	    }
	}
	return result;
    }

}
