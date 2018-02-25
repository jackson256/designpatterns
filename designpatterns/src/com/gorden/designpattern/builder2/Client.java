package com.gorden.designpattern.builder2;

public class Client {
	
	public static void main(String[] args) {
		Builder builder = new GoodbyeBuilder();
		Director director = new Director(builder);
		director.construct("toAddress@45126184@qq.com", "fromAddress@110.com");
	}

}
