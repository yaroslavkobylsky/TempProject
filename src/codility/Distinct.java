package codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static int solution(int A[], int N){
        Set<Integer> resultSet = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++){
            if (resultSet.contains(A[i])){
                continue;
            }
            else {
                resultSet.add(A[i]);
            }
        }
        return resultSet.size();
    }

    public static void main(String[] args) {
        int [] values = new int [] {2,1,1,2,3,1,5};
        System.out.println("result: " + solution(values, 0));
    }
}
