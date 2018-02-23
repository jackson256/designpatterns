package com.gorden.designpattern.singleton;

/**
 * 懒汉式单例类.在第一次调用的时候实例化自己
 * 
 * @author huhan
 * @date 2018-01-31
 */
public class Singleton2 {

	// 构造方法私有化
	private Singleton2() {
	}
	
	//被volatile修饰的变量的值，将不会被本地线程缓存，
	//所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
	private volatile static Singleton2 instance = null;

	// 静态工厂方法
	public static Singleton2 getInstance() {
		if (instance == null) {
			// 同步快，线程安全
			synchronized (Singleton2.class) {
				if (instance == null) {
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}

}

/**
 * Singleton通过将构造方法限定为private避免了类在外部被实例化，在同一个虚拟机范围内，
 * Singleton的唯一实例只能通过getInstance()方法访问。
 * （事实上，通过Java反射机制是能够实例化构造方法为private的类的，那基本上会使所有的Java单例实现失效。此问题在此处不做讨论，
 * 姑且掩耳盗铃地认为反射机制不存在。
 */
