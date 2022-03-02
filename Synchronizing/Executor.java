public class Executor extends Thread {
    String name;
    Thread t = null;
    Task task;
    int number;
    public Executor(){};
    public Executor(String name,int number){
        this.name = name;
        this.number = number;
        this.task = new Task();
    }

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("Task: "+name+" started");
            task.perform(number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        if(t == null){
            t = new Thread(this);
            t.start();
        }
        t.start();

    }
}
