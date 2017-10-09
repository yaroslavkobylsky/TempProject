package threads.waitnotify;

import java.util.List;

class Producer implements Runnable
{
    private final List<Integer> list;
    private final int           LIST_LENGTH;

    public Producer(List<Integer> sharedList, int size)
    {
        this.list = sharedList;
        this.LIST_LENGTH = size;
    }

    @Override
    public void run()
    {
        int counter = 0;
        while (true)
        {
            try
            {
                produce(counter++);
            }
            catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }
    }

    private void produce(int i) throws InterruptedException
    {
        synchronized (list)
        {
            while (list.size() == LIST_LENGTH)
            {
                System.out.println("List is full " + Thread.currentThread().getName() + " is waiting , size: " + list.size());
                list.wait();
            }

            Thread.sleep(1000);
            list.add(i);
            System.out.println("Produced: " + i);
            list.notifyAll();
        }
    }
}
