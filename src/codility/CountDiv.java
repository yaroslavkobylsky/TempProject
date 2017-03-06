package codility;

public class CountDiv {
    public static int solution(int A, int B, int K){
        int counter = 0;
        for (int i = A; i <= B;){
            if(i%K == 0){
                counter++;
                counter = counter + (int)(B-i)/K;
                return counter;
            }
            else {
                i++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("result:" + solution(-2, 10, 2));
    }
}
