public class ExtendThread extends Thread {
    Thread t;
    String threadName;

    ExtendThread(String name) {
        threadName = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + i + " " + threadName);
        }
    }
    public  void execute() {
        t = new Thread(this, threadName);
        t.start();
    }
    public static void main(String[] args) {
        ExtendThread thread1 = new ExtendThread("pacis");
        thread1.execute();
        ExtendThread thread2 = new ExtendThread("Testing");
        thread2.execute();
    }
}