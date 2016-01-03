package protectedtest;

public class ChildClasss extends ParentClass {
    public static void main(String[] args) {
        ChildClasss childClasss = new ChildClasss();
        childClasss.parentMethod();
    }

    @Override
    public void parentMethod() {
        /*super.parentMethod();*/
        System.out.println("and child method!!!");
    }
}
