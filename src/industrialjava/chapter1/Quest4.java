package industrialjava.chapter1;

import java.io.IOException;

public class Quest4 {
    public static void main(String[] args) {
        byte b[]=new byte[80];
        for (int i=0;i<b.length;i++)
            try {
                b[i]=(byte)System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        System.out.print("ok");
    } }
