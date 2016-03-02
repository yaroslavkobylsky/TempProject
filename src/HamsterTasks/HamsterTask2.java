package HamsterTasks;

import java.util.ArrayList;

public class HamsterTask2 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>(){
            {
                add("salupa");
                add("salupa2");
                add("salupa3");
            }
        };
        for (String entity: strings){
            System.out.println(entity);
        }
    }
}
