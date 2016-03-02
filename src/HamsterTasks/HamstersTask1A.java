package HamsterTasks;

import java.io.IOException;

public class HamstersTask1A extends HamstersTask1 {
    public HamstersTask1A() {
        super();
    }

    @Override
    public void method1() throws IndexOutOfBoundsException{
        System.out.println("hamstersTask1 method1A");
    }

    public static void main(String[] args) {
        HamstersTask1A hamstersTask1A = new HamstersTask1A();
        hamstersTask1A.method1();
    }


}
