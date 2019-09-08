package threads;

import java.util.LinkedList;

public class ProducerConsumer {

	private LinkedList<Integer> buffer = new LinkedList<Integer>();
	private int capacity = 3;
	private static int value = 0;
	private static boolean isDone = false;
	public void produce() throws InterruptedException {
//		int value = 0;
		while (true) {
			synchronized (this) {
				if (buffer.size() == capacity) {
					wait();
				}

				System.out.println("Producing value : " + value);

				buffer.add(value++);
				isDone = true;
				if (isDone) {
					isDone = false;
					notify();
					wait();
				}
//				notify();
				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		int val;
		while (true) {
			synchronized (this) {
				if (buffer.size() == 0) {
					wait();
				}
				val = buffer.removeFirst();
				System.out.println("Consuming value : " + val);
				isDone = true;
				if (isDone) {
					isDone = false;
					notify();
					wait();
				}
//				notify();
				Thread.sleep(1000);

			}
		}
	}
}
