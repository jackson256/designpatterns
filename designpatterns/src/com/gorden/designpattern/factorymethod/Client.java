package com.gorden.designpattern.factorymethod;

import com.gorden.designpattern.simplefactory.Car;

public class Client {
	
	private static Car benzCar,bmwCar;
	
	private static AbstractFactory benzcarFactory,bmwcarFactory;
	
	public static void main(String[] args) {
		benzcarFactory=new BenzFactory();
		benzCar=benzcarFactory.driveFactory();
		
		benzCar.drive();

	}

}
