package threads;

public class MyThread1 implements Runnable {
    private String field;

    public MyThread1(String field) {
        this.field = field;
    }
    @Override
    public void run() {
        while (true){
            synchronized (field){
                System.out.println("Thread 1 id: " + Thread.currentThread().getId());
                System.out.print("Thread 1: ");
                System.out.println(field);
                try {
                    field.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
