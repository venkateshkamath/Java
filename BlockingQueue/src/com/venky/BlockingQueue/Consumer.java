package com.venky.BlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	BlockingQueue<Integer> questionQueue;
 public Consumer(BlockingQueue<Integer> questionQueue) {
	 this.questionQueue=questionQueue;
 }
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println("Answered Question "+questionQueue.take());//Not only removes but also notifies. Efficient way of coding.
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
