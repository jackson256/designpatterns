package com.gorden.designpattern.builder;

public class Director {
	
	/**
	 * 持有当前需要使用的建造者对象
	 */
	private Builder builder;
	/**
	 * 构造方法，传入建造者对象
	 */
	public Director(Builder builder){
		this.builder = builder;
	}
	/**
	 * 产品构造方法，负责调用各个零件建造方法等，比如产品的生产顺序等
	 */
	public void constuct(){
		builder.buildPart1();
		builder.buildPart2();
	}

}
