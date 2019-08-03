package codility.tasks;

public class MaxTriplet {

    /**
     * Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
     *
     * @param A non-empty array of N integers
     * @return MaxProductOfThree
     */
    public int solution(int[] A) {

        if (A.length == 3) { return A[0] * A[1] * A[2]; }

        int[] maxs = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int[] mins = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};

        for (int i = 0; i < A.length; i++) {

            if (A[i] > maxs[2]) {
                maxs[0] = maxs[1];
                maxs[1] = maxs[2];
                maxs[2] = A[i];
            }
            else if (A[i] > maxs[1]) {
                maxs[0] = maxs[1];
                maxs[1] = A[i];
            }
            else if (A[i] > maxs[0]) {
                maxs[0] = A[i];
            }

            if (A[i] < mins[0]) {
                mins[1] = mins[0];
                mins[0] = A[i];
            }
            else if (A[i] < mins[1]) {
                mins[1] = A[i];
            }
        }

        return Math.max(maxs[0] * maxs[1] * maxs[2], maxs[2] * mins[0] * mins[1]);
    }
}
