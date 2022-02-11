public class RunnableDemo implements  Runnable {
    Thread t;
    String threadName;

    RunnableDemo(String name) {
        threadName = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + i + " " + threadName);
        }
    }
    public void execute() {
        t = new Thread(this, threadName);
        t.start();
    }
}