package com.designpatterns.creational.singleton;

public class Singleton_egger_itilization {
	
	private static Singleton_egger_itilization instance = new Singleton_egger_itilization();
	
	private Singleton_egger_itilization() {
		System.out.println("Creating........");
	}
	
	public static Singleton_egger_itilization getInstance() {
		return instance;
	}

	
	public static void main(String[] args) {
		Singleton_egger_itilization instance1 = Singleton_egger_itilization.getInstance();
		print("Instance1: ",instance1);
		Singleton_egger_itilization instance2 = Singleton_egger_itilization.getInstance();
		print("Instnance2: ",instance2);
	}
	
	public static void print(String name, Singleton_egger_itilization obj ) {
		System.out.println("Name :"+name +"Hashcode :"+obj.hashCode());
	}

}


