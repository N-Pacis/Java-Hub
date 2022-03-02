public class Task {

    public void perform(int n) throws InterruptedException {
        for(int i=1; 1<=12; i++){
            System.out.println(i+"*12 ="+i*n);
            Thread.sleep(100);
        }
    }
}
