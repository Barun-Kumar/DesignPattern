package com.designpatterns.creational.singleton;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton_Lazy_initialization {
	private static Singleton_Lazy_initialization instance = null;

	private Singleton_Lazy_initialization() {
		System.out.println("Creating........");
	}

	public static Singleton_Lazy_initialization getInstance() {
		if (Objects.isNull(instance)) {
			instance = new Singleton_Lazy_initialization();
		}
		return instance;
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Runnable task1 = () -> {
			Singleton_Lazy_initialization instance1 = Singleton_Lazy_initialization.getInstance();
			print("Instance1: ", instance1);
		};
		Runnable task2 = () -> {
			Singleton_Lazy_initialization instance2 = Singleton_Lazy_initialization.getInstance();
			print("Instnance2: ", instance2);
		};
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.shutdown();
	}

	public static void print(String name, Singleton_Lazy_initialization obj) {
		System.out.println("Name :" + name + "Hashcode :" + obj.hashCode());
	}
}
