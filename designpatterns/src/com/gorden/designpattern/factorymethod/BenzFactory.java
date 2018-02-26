package com.gorden.designpattern.factorymethod;

import com.gorden.designpattern.simplefactory.BenzCar;
import com.gorden.designpattern.simplefactory.Car;

public class BenzFactory implements AbstractFactory{

	@Override
	public Car driveFactory() {
		// TODO Auto-generated method stub
		return new BenzCar();
	}

}
