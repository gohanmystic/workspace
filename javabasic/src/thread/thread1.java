package thread;

public class thread1 {

	public static void main(String[] args) {

		Thread thread = new Thread() {
			public void run() {

				try {
					System.out.println("Start");
					Thread.sleep(3000);
					System.out.println("End");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		/*
		 * thread.start(); thread.run(); thread.run();
		 */

		myThread mT = new myThread();
		//mT.start();
		Thread thread1 = new Thread(mT);
		Thread thread2 = new Thread(mT);
		thread1.setName("Thread1");
		thread2.setName("Thread2");
		thread1.start();
		thread2.start();
//		myThread2 mT2 = new myThread2();
///		mT2.start();
//		mT2.run();
	}
}

class myThread extends Thread {
	private int money = 500;
	public synchronized void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1);
				System.out.println(i + " - " + Thread.currentThread().getName() + " - " + money);
				money -= 50;
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class myThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 9; i >= 0; i--) {
				System.out.println(i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
