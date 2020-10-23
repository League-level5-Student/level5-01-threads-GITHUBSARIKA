package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
private Thread[] threads;
private ConcurrentLinkedQueue<Task> taskQueue;
public ThreadPool(int totalThreads) {
	
	threads=new Thread[totalThreads];
	for (int i = 0; i < threads.length; i++) {
		Worker worker=new Worker();
		threads[i]= new Thread(worker);
	}
	taskQueue=new ConcurrentLinkedQueue<Task>();
}
public void addTask(Task task) {
	taskQueue.add(task);
}
public void start() {
 for (int i = 0; i < threads.length; i++) {
	threads[i].start();
	
}
 for (int i = 0; i < threads.length; i++) {
	 try {
			threads[i].join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
}
}
}
