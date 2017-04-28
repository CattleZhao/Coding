package test;

public class test implements Runnable{
	private int count = 50;
	@Override
	public void run() {
		while(true){
			if(count <= 0)
				break;
			System.out.println(Thread.currentThread().getName()+" "+count--);
		}
	}
	
	public static void main(String[] args) {
		test t = new test();
		Thread t1 =new Thread(t,"甲");
		Thread t2 = new Thread(t,"乙");
		Thread t3 = new Thread(t,"丙");
		Thread t4 = new Thread(t,"丁");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}