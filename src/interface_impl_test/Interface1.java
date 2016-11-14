package interface_impl_test;

/**
 * Created by Admin on 08.06.16.
 */
public interface Interface1 {
    void getA();
    void getB();
    default void getD(){
        System.out.println("interface 1 default method!");
    }
}
