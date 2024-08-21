package threads;

public class RunnableMain {
    public static void main(String[] args) {
        ThreadDemo runnable1 = new ThreadDemo("Thread-1");
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        ThreadDemo runnable2 = new ThreadDemo("Thread-2");
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}


