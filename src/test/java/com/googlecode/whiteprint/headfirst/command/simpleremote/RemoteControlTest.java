package com.googlecode.whiteprint.headfirst.command.simpleremote;

import org.junit.Test;

public class RemoteControlTest {

    @Test
    public void test() {
	SimpleRemoteControl remote = new SimpleRemoteControl();
	Light light = new Light();
	GarageDoor garageDoor = new GarageDoor();
	LightOnCommand lightOn = new LightOnCommand(light);
	GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

	remote.setCommand(lightOn);
	remote.buttonWasPressed();
	remote.setCommand(garageOpen);
	remote.buttonWasPressed();
    }
}
