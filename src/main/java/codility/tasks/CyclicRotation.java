package codility.tasks;

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

        if (K < 1) {
            return A;
        }

        int[] rotatedA = new int[A.length];

        for(int i=0, j=A.length-K; i<K; i++,j++) {
            rotatedA[i] = A[j];
        }

        for(int i=K, j=0; i<A.length; i++,j++) {
            rotatedA[i] = A[j];
        }

        return rotatedA;
    }
}
