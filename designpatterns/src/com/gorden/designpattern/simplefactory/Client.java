package com.gorden.designpattern.simplefactory;

public class Client {
	
	public static void main(String[] args) throws Exception {
		Car car = DriverFactory.driveCar("benzCar");
		car.drive();
	}

}
