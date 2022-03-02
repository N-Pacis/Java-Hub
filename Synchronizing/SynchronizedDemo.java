public class SynchronizedDemo {
    public static void main(String[] args) {
        Executor executor = new Executor("Multiply by "+2, 2);
        System.out.println("Thread action start");
//        executor.start();
    }
}
