package threads;

public class MyThread2 implements Runnable{
    private String field;

    public MyThread2(String field) {
        this.field = field;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Thread 2 id: " + Thread.currentThread().getId());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (field){
                System.out.print("Thread 2: ");
                System.out.println(field);
                field.notify();
            }
        }
    }
}
