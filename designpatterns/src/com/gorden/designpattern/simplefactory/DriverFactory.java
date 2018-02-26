package com.gorden.designpattern.simplefactory;

public class DriverFactory {
	
	//返回类型必须为抽象产品角色
	public static Car driveCar(String params) throws Exception{
		if(params.equals("benzCar")){
			return new BenzCar();
		}else if(params.equals("bwmCar")){
			return new BwmCar();
		}else{
			throw new Exception();
		}
	}

}
