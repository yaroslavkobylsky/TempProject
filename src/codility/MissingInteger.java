package codility;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public static int solution(int A[], int N){
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i<A.length; i++){
            set.add(new Integer(A[i]));
        }
        int result = 1;
        while(set.contains(result)){
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] integers = new  int[]{1, 2, 3, 5, 7, 4, 5, 9, 1};
        System.out.println("result: " + solution(integers, 0));
    }
}
