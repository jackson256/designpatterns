package com.gorden.designpattern.builder2;

public class GoodbyeBuilder extends Builder{
	
	public GoodbyeBuilder(){
		msg = new GoodbyeMessage();
	}

	@Override
	public void buildSubject() {
		// TODO Auto-generated method stub
		msg.setSubject("欢送标题");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		msg.setBody("欢送内容");
	}
	
	

}
