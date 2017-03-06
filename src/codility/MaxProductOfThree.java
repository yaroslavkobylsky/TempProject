package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxProductOfThree {
    public static int solution(int[] A){
        List<Integer> moreZero = new ArrayList<Integer>();
        List<Integer> lessZero = new ArrayList<Integer>();
        boolean zeroFlag = false;
        if(A.length<3){
            return 0;
        }

        for (int i=0; i<A.length; i++){
            if (A[i]>0){
                moreZero.add(A[i]);
            }
            else {
                if (A[i]<0)
                lessZero.add(A[i]);
            }

            if (A[i] == 0){
                zeroFlag = true;
            }
        }
        Collections.sort(moreZero);
        Collections.sort(lessZero);
        System.out.println("more: " + Arrays.toString(moreZero.toArray()));
        System.out.println("less: " + Arrays.toString(lessZero.toArray()));

        if (moreZero.size()>=3){
            return moreZero.get(moreZero.size()-1) * moreZero.get(moreZero.size()-2) * moreZero.get(moreZero.size()-3);
        }

        if (moreZero.size()== 2 && zeroFlag){
            return 0;
        }

        if (moreZero.size()== 1 && lessZero.size()>=2){
            return moreZero.get(0) * lessZero.get(0) * lessZero.get(1);
        }

        if (moreZero.size()== 0 && lessZero.size()==2 && zeroFlag){
            return 0;
        }

        if (moreZero.size()== 0 && lessZero.size()>=3 && zeroFlag){
            return 0;
        }

        if (moreZero.size()== 0 && lessZero.size()>=3){
            return lessZero.get(lessZero.size()-1) * lessZero.get(lessZero.size()-2) * lessZero.get(lessZero.size()-3);
        }

        return 0;
    }

    public static void main(String[] args) {
        int [] ints = new int []{-3,1,2,-2,5,6};
        System.out.println("result: " + solution(ints));
    }
}
