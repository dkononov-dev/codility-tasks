package codility.tasks;

public class MissingInteger {

    /**
     * Find the smallest positive integer that does not occur in a given sequence.
     *
     * @param A array of N integers:
     *          N is an integer within the range [1..100,000];
     *          each element of array A is an integer within the range [−1,000,000..1,000,000].
     * @return the smallest positive integer that does not occur in a sequence A.
     */
    public int solution(int[] A) {

        int[] occur = new int[100001];

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 0) {
                continue;
            }

            if (A[i] <= 100000) {
                occur[A[i]] = 1;
            }
        }

        for (int i = 1; i < occur.length; i++) {
            if (occur[i] == 0) {
                return i;
            }
        }

        return 100001;
    }
}
