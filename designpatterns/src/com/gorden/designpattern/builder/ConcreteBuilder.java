package com.gorden.designpattern.builder;

public class ConcreteBuilder implements Builder{
	
	private Product product = new Product();

	@Override
	public void buildPart1() {
		product.setPart1("编号：007");
	}

	@Override
	public void buildPart2() {
		product.setPart2("名称：暗黑者");
	}

	@Override
	public Product retrieveResult() {
		return product;
	}

}
