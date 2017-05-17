package enums;

import java.util.Arrays;

/**
 * Created by Admin on 3/2/16.
 */
public class EnunsExample {
    private Enum enumField;

    public static void main(String[] args) {
        EnunsExample enunsExample = new EnunsExample();
        enunsExample.setEnumField(Enum.SECOND);
        System.out.println(enunsExample.getEnumField());
        System.out.println(Arrays.toString(Enum.values()));
        System.out.println("enum current value number" + enunsExample.getEnumField().ordinal());
    }

    public EnunsExample() {
    }

    public Enum getEnumField() {
        return enumField;
    }

    public void setEnumField(Enum enumField) {
        this.enumField = enumField;
    }
}
