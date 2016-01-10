package protectedtest;

public class AnotherClass {
    private ChildClasss childClasss;

    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.setChildClasss(new ChildClasss());
        ChildClasss childClasss1 = anotherClass.getChildClasss();
        childClasss1.parentMethod();
    }

    public ChildClasss getChildClasss() {
        return childClasss;
    }

    public void setChildClasss(ChildClasss childClasss) {
        this.childClasss = childClasss;
    }
}
