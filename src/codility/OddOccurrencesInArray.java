package codility;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    public static int solution2(int A[], int N){
        int result = 0;

        for (int i=0; i<A.length-2; i++){
            if (A[i] == A[i+2]){
                continue;
            }
            else {
                result = A[i+2];
            }
        }
        return result;
    }

    public static int solution(int A[], int N){
        Set<Integer> set = new HashSet<Integer>();
        for (int i : A){
            if (set.contains(i)){
                set.remove(i);
            }
            else {
                set.add(i);
            }
        }

        return set.iterator().next();
    }

    public static void main(String[] args) {
        int [] A = new int []{9, 3, 9, 3, 9, 6, 9};
        System.out.println("result: " + solution2(A, 0));
    }
}
