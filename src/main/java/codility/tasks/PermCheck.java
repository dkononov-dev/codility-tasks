package codility.tasks;

public class PermCheck {

    /**
     Check whether array is a permutation.
     * @param A non-empty array consisting of N integers, where N is an integer within the range [1..100,000];
     *         each element of array A is an integer within the range [1..1,000,000,000].
     * @return  1 if array A is a permutation and 0 if it is not.
     */
    public int solution(int[] A) {

        int[] occur = new int[100001];

        for(int i = 0; i < A.length; i++) {
            if (A[i] < occur.length) {
                occur[A[i]] = 1;
            }
        }

        for(int i = 1; i <= A.length; i++) {
            if (occur[i]==0) {
                return 0;
            }
        }

        return 1;
    }
}
