package threads.waitnotify;

import java.util.List;

class Consumer implements Runnable
{
    private final List<Integer> list;

    public Consumer(List<Integer> sharedList)
    {
        this.list = sharedList;
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                consume();
            } catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException
    {
        synchronized (list)
        {
            while (list.isEmpty())
            {
                System.out.println("list is empty " + Thread.currentThread().getName() + " is waiting , size: " + list.size());
                list.wait();
            }
            Thread.sleep(1000);
            int i = (Integer) list.remove(0);
            System.out.println("Consumed: " + i);
            list.notifyAll();
        }
    }
}
