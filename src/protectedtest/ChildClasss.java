package protectedtest;

public class ChildClasss extends ParentClass {
    public static void main(String[] args) {
        ChildClasss childClasss = new ChildClasss();
        childClasss.parentMethod();
        System.out.println("========================");
        childClasss.sameClassArgumentTest(new ChildClasss());
    }

    @Override
    protected void parentMethod() {
        /*super.parentMethod();*/
        System.out.println("and child method!!!");
    }

    protected void parentMethod(int i) {
    }



    /*giving the same class argument*/
    public void sameClassArgumentTest(ChildClasss childClasss){
        childClasss.parentMethod();
    }
}
