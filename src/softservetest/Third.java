package softservetest;

public class Third {
    public static char c1 = 064770;
    /*public static char c2 = 'face';*/
    public static char c3 = 0xbeef;
    /*public static char c4 = \u0022;
    public static char c5 = '\iface';*/
    public static char c6 = '\uface';

    public static void main(String[] args) {
        System.out.println("c1=" + c1);
        System.out.println("c3=" + c3);
        System.out.println("c6=" + c6);
        System.out.println("c1=" + (int)c1);
        System.out.println("c3=" + (int)c3);
        System.out.println("c6=" + (int)c6);

    }
}
