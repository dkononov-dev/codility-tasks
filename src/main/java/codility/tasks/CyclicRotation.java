package codility.tasks;

import java.util.Arrays;

public class CyclicRotation {

    /**
     * Rotate an array to the right by a given number of steps.
     * @param A An array consisting of N integers
     * @param K times to rotate to the right
     * @return rotated array
     */
    public int[] solution(int[] A, int K) {

        if (A.length < 2) {
            return A;
        }

        K = K % A.length;

        if (K == 0) {
            return A;
        }

        int[] pushedOutElementsOfA = Arrays.copyOfRange(A, A.length - K, A.length);
        System.arraycopy(A, 0, A, K, A.length - K);
        System.arraycopy(pushedOutElementsOfA, 0, A, 0, pushedOutElementsOfA.length);

        return A;
    }
}
