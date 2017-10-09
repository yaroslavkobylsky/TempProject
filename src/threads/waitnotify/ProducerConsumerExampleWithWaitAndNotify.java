package threads.waitnotify;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerExampleWithWaitAndNotify {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        int LIST_LENGTH = 5;
        Thread producer = new Thread(new Producer(list, LIST_LENGTH), "Producer");
        Thread consumer = new Thread(new Consumer(list), "Consumer");
        producer.start();
        consumer.start();
    }
}
