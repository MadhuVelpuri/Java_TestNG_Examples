package tricks;

public class Thread_Ex extends Thread {

	int counter;

	public static void main(String a[]) throws InterruptedException {
		Thread_Ex th = new Thread_Ex();
		th.start();
		Thread.sleep(1000);
		System.out.println("Waiting to get end");
		synchronized (th) {
			th.wait();
		}
		System.out.println(th.counter);
	}

	@Override
	public void run() {
		synchronized (this) {

			for (int i = 0; i <= 10000; i++)
				counter++;
			this.notifyAll();
			System.out.println("Completed Counting...");

		}
	}

}
