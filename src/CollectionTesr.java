import java.util.ArrayList;
import java.util.List;

public class CollectionTesr {
    public static void main(String[] args) {
        System.out.println("111111111111");
        List<String> strings = new ArrayList<String>();
        String var;
        for (int i=0; i>10; i++){
            System.out.println(i);
            var = new String(Integer.toString(i));
            strings.add(var);
        }
        /*CollectionTesr collectionTesr = new CollectionTesr();
        collectionTesr.test();*/
    }

    public void test(){
        List<String> strings = new ArrayList<String>();
        String var;
        for (int i=0; i>10; i++){
            System.out.println(i);
            var = new String(Integer.toString(i));
            strings.add(var);
        }

        for (String s:  strings){
            System.out.println(s.toString());
        }
    }
}
