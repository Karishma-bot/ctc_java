package threadPrograms;

public class ImplementingRunnable  implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implementing Runnable interface");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingRunnable t=new ImplementingRunnable();
		Thread t1= new Thread(t);
		t1.start();
	}

}
