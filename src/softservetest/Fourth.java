package softservetest;

public class Fourth {
    public static void main(String[] args) {
        try{
            int x = 0;
            int y = 5 / x;
        }catch (Exception e) {
            System.out.println("Exception");
        /*} catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }*/
        }
        System.out.println("finished");
    }
}
