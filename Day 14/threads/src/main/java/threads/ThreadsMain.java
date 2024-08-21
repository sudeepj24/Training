package threads;

public class ThreadsMain {
    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo("Thread-1");
        thread1.start();

        ThreadDemo thread2 = new ThreadDemo("Thread-2");
        thread2.start();
}
}

