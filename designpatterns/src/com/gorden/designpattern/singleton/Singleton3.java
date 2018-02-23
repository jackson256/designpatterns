package com.gorden.designpattern.singleton;

/**
 * 懒汉式单例类.在第一次调用的时候实例化自己
 * 
 * @author huhan
 * @date 2018-01-31
 */
public class Singleton3 {

	// 构造方法私有化
	private Singleton3() {
	}

	/**
	 * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载
	 */
	private static class SingletonHolder {
		/*
		 * 静态初始化，由JVM保证线程安全
		 */
		private static Singleton3 instance = new Singleton3();

	}

	public static Singleton3 getInstance() {
		return SingletonHolder.instance;
	}

}
