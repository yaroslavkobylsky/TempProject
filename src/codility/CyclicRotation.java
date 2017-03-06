package codility;

import java.util.Arrays;

public class CyclicRotation {
    public static int[] solution(int A[], int N, int K){
        for (int i = 0; i < K; i++){
            if (A.length == 0){
                return A;
            }
            int lastElement = A[A.length-1];
            for (int j=A.length-1; j>0; j--){
                A[j] = A[j-1];
            }
            A[0] = lastElement;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] ints = new int []{1, 2, 3, 4, 5, 6};
        System.out.println("result: " + Arrays.toString(solution(ints, 0, 2)));
        System.out.println("result: " + Arrays.toString(solution(ints, 0, 1)));
        System.out.println("result: " + Arrays.toString(solution(ints, 0, 3)));
    }
}
