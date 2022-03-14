public class Executor extends Thread {
    String name;
    Thread t;
    Task task;
    int number;

    public Executor() {
    }

    public Executor(String name, int number,Task task) {
        this.name = name;
        this.number = number;
        this.task = task;
    }

    @Override

    public void run() {
        synchronized (this.task){
            System.out.println("Task " + name + " Started.");
            try {
                this.task.perform(number);
                System.out.println("Task " + name + " Completed");
                System.out.println("-------------------------------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }


}