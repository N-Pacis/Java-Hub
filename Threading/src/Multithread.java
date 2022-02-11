public class Multithread{
    public static void main(String[] args) {
        new Thread(new Runnable() {

            public void run() {
                for(int i =0;i<10;i++) {
                    System.out.println("D rockefeller");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}