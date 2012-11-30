package com.googlecode.whiteprint.example.montyhall;

import java.util.logging.Logger;

public class Door {

    private final Logger log = Logger.getLogger(Door.class.getName());

    private int number;
    private boolean prize = false;
    private boolean open = false;
    private Person punter;
    private Person host;

    public Door(int number) {
	this.number = number;
    }

    public int getNumber() {
	return number;
    }

    public boolean isPrize() {
	return prize;
    }

    public void addPrize() {
	this.prize = true;
	log.fine("door " + number + " has been given the prize");
    }

    public boolean isOpen() {
	return open;
    }

    public void open() {
	this.open = true;
	log.fine("door " + number + " has been opened");
    }

    public Person getPunter() {
	return punter;
    }

    public void setPunter(Person punter) {
	this.punter = punter;
	log.fine(punter.getName() + " is standing at door " + number);
    }

    public Person getHost() {
	return host;
    }

    public void setHost(Person host) {
	this.host = host;
	log.fine(host.getName() + " is standing at door " + number);
    }

}
