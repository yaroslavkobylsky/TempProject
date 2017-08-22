package vac_quizes;

public class Mountain {
    String name = "Himalaya";
    static Mountain getMountain() {
        System.out.println("Getting Name ");
        return null;
    }
    public static void main(String[ ] args) {
        System.out.println( getMountain().name );
    }
}
