package interface_impl_test;


public class Implementation implements Interface1, Interface2 {
    @Override
    public void getA() {

    }

    @Override
    public void getB() {

    }

    @Override
    public void getC() {

    }

    @Override
    public void getD() {
        System.out.println("implementation overrided method");
    }

    public void getF() {
        System.out.println("implementation overrided method");
    }

    public int getF(int i) {
        System.out.println("implementation overrided method");
        return 1;
    }

    }
