package threads;

public class ProducerConsumerDemo {
	public static void main(String[] args) {

		ProducerConsumer producerConsumer = new ProducerConsumer();

		Thread prod = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producerConsumer.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread cons = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					producerConsumer.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		prod.start();
		cons.start();

	}
}
