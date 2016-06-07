import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        int [] args2 = new int [5];
        args2[0] = 1;
        args2[1] = 2;
        args2[2] = 3;
        args2[3] = 4;
        args2[4] = 5;

        String [] args3 = new String [5];
        args3[0] = "1";
        args3[1] = "2";
        args3[2] = "3";
        args3[3] = "4";
        args3[4] = "5";

        try {
            System.out.println("count: " + Arrays.stream(args2).count());
            System.out.println("sum: " + Arrays.stream(args2).sum());
            System.out.println("sum more than 2 : " + Arrays.stream(args2).filter(o -> o > 2).sum());
            System.out.println("sum more than 2 less 5  : " + Arrays.stream(args2).filter(o -> o > 2 && o < 5).sum());
            System.out.println("sum every element plus 1: " + Arrays.stream(args2).map(i -> i + 1).sum());
            System.out.println("sum more than 2 less than 5 : " + Arrays.stream(args2).filter(o -> o > 2 && o < 5).sum());
            double sum = Arrays.stream(args2).sum();
            System.out.println("sum: " + sum);

            System.out.println("array to string: " + Arrays.toString(args3));


            /*double average = roster
                    .stream()
                    .filter(p -> p.getGender() == Person.Sex.MALE)
                    .mapToInt(Person::getAge)
                    .average()
                    .getAsDouble();*/
        } catch (NumberFormatException e) {
            /*System.out.println("Ошибка в аргументах. Использовать следует так: java Main <число1> <число2> ... ");*/
            System.out.println("HELLO!");
        }
    }
}
