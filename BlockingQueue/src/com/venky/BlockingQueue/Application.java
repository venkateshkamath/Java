package com.venky.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

	public static void main(String[] args) {
		BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);//Writing Capacity for queue is very important. Here it is 5
		Consumer consumer = new Consumer(questionQueue);
		Producer prodo = new Producer(questionQueue);
		Thread t1 = new Thread(prodo);
		Thread t2 = new Thread(consumer);
		t2.start();
		t1.start();
		
	}

}
