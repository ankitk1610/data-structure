package threads;

public class EvenOddDemo {
	public static void main(String[] args) {

		Thread even = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (this) {

					for (int i = 0; i < 5; i += 2) {
						System.out.println(Thread.currentThread().getName() + " " + i);
						try {
							notify();
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();

						}
					}

				}
			}
		});

		Thread odd = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (this) {

					for (int i = 1; i <= 5; i += 2) {
						System.out.println(Thread.currentThread().getName() + " " + i);
						try {
							notify();
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();

						}
					}

				}
			}
		});

		even.start();
		//odd.start();

		try {
			even.join();
			odd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
