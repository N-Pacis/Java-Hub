import java.io.IOException;

public class SynchronisationDemo {
    public static void main(String[] args) throws IOException {
        Task task = new Task();
        Executor executor1=new Executor("Multiplying by 5",5,task);
        Executor executor2=new Executor("Multiplying by 3", 3,task);
        executor1.start();
        executor2.start();

    }
}