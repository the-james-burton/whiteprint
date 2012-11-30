package com.googlecode.whiteprint.example.montyhall;

import java.util.logging.Logger;

public class Person {

    private final Logger log = Logger.getLogger(Person.class.getName());

    private String name;
    private Door door;
    private boolean swapped = false;
    private boolean won = false;

    public Person(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setDoor(Door door) {
	log.fine(name + " walks to door " + door.getNumber());
	this.door = door;
	door.setPunter(this);
    }

    public Door getDoor() {
	return door;
    }

    public boolean isSwapped() {
	return swapped;
    }

    public void setSwapped() {
	this.swapped = true;
    }

    public boolean isWon() {
	return won;
    }

    public void setWon() {
	this.won = true;
    }

}
