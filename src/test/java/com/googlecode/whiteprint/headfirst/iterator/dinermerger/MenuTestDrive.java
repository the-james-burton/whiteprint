package com.googlecode.whiteprint.headfirst.iterator.dinermerger;

import java.util.ArrayList;

import org.junit.Test;

public class MenuTestDrive {

    @Test
    public void test() {
	PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
	DinerMenu dinerMenu = new DinerMenu();

	Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

	waitress.printMenu();
    }

    private void printMenu() {
	PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
	DinerMenu dinerMenu = new DinerMenu();

	ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

	for (int i = 0; i < breakfastItems.size(); i++) {
	    MenuItem menuItem = (MenuItem) breakfastItems.get(i);
	    System.out.print(menuItem.getName());
	    System.out.println("\t\t" + menuItem.getPrice());
	    System.out.println("\t" + menuItem.getDescription());
	}

	MenuItem[] lunchItems = dinerMenu.getMenuItems();

	for (int i = 0; i < lunchItems.length; i++) {
	    MenuItem menuItem = lunchItems[i];
	    System.out.print(menuItem.getName());
	    System.out.println("\t\t" + menuItem.getPrice());
	    System.out.println("\t" + menuItem.getDescription());
	}
    }
}
