package com.ss.assignment4.consumerproducer;

import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
	public LinkedBlockingQueue<Integer> buffer = new LinkedBlockingQueue<>(10);
	
	Integer getSize() {
		return buffer.size();
		
	}
	
	public static void main(String[] args) {
		ProducerConsumer itemArray = new ProducerConsumer();
		
		Thread producer = new Thread(() -> {
				while (true) {
					try {
						itemArray.produce();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		});
		
		Thread consumer = new Thread(() -> {
			while (true) {
				try {
					itemArray.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
		
		while (true) {
			try {
				Thread.sleep(500);
				System.out.println(itemArray.getSize());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	void produce() throws InterruptedException {
		buffer.put(0);
	}
	
	void consume() throws InterruptedException {
		buffer.take();
	}
}
