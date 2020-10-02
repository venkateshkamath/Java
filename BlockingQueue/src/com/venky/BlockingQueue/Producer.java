package com.venky.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<>(5);
	int questionNo=0;
	public Producer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue= questionQueue;
	}
		@Override
	public void run() {
		while (true) {
			
			try {
				Thread.sleep(5000);
			
					int nextQuestion = questionNo++;
					System.out.println("Got new question " + nextQuestion);
					synchronized (this) {	questionQueue.put(nextQuestion);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
