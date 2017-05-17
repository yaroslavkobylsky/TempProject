package softservetest;


public class Quizes {
    public static void main(String[] args) {

        int myList [] = {1, 2,3};
        //---------------------

        int i = 2;
        final int i1 = 2;

        //---------------------

        char c1 = 064770;
        /*char c2 = 'face';*/
        char c3 = 0xbeef;
        /*char c4 = \u0022;*/
        /*char c5 = '\iface';*/
        char c6 = '\uface';
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c6);
        //---------------------

        try {
            int x = 0;
            int y = 5/0;
        }
        catch(Exception e){
            System.out.println("exception");
        }



    }
}
