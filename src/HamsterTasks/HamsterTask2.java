package hamstertasks;

import java.util.ArrayList;

/**
 * Created by Admin on 12/14/15.
 */
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
