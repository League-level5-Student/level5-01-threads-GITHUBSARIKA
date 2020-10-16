package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable{
	int currentThread;
public ThreadedGreeter(int currentThread) {
	this.currentThread=currentThread;
}
	@Override
	public void run() {
		  if(currentThread<=50) {
			  System.out.println("Hello from thread number: " + currentThread);
			  ThreadedGreeter tg=new ThreadedGreeter(currentThread+1);
			  Thread t=new Thread(tg); 
			  t.start();
			  try {
				  t.join();
			  }catch(InterruptedException e) {
				  e.printStackTrace();
			  }
		  }
	}

}
