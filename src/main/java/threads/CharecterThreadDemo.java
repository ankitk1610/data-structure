package threads;

import java.util.ArrayList;
import java.util.List;

public class CharecterThreadDemo {
	public static void main(String[] args) {
		char[] a = { 'a', 'b', 'c', 'd', 'e' };
		String s = "abcdeabceabdcea";
		CharPrinter charPrinter = new CharPrinter();
		List<Thread> myThreads = new ArrayList<Thread>();
		for (int i = 0; i < a.length; i++) {

			char curr = a[i];
			myThreads.add(new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						charPrinter.print(s, curr);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}));
		}

		for (Thread t : myThreads) {
			t.start();
		}
	}

}

class CharPrinter {

	static int i = 0;

	void print(String s, char a) throws InterruptedException {
		synchronized (this) {
			while (i < s.length()) {
				if (s.charAt(i) != a) {
					wait();
				}
				System.out.println(Thread.currentThread().getName() + " : " + s.charAt(i++));
				notify();
				Thread.sleep(1000);
			}

		}
	}

}
