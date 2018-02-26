package com.gorden.designpattern.factorymethod;

import com.gorden.designpattern.simplefactory.BwmCar;
import com.gorden.designpattern.simplefactory.Car;

public class BmwCar implements AbstractFactory{

	@Override
	public Car driveFactory() {
		// TODO Auto-generated method stub
		return new BwmCar();
	}

}
