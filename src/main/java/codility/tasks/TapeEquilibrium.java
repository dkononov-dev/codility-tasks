package codility.tasks;

public class TapeEquilibrium {

    /**
     * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
     * @param A Non-empty array consisting of N integers is given; represents numbers on a tape.
     * @return the minimal difference that can be achieved by splitting the tape.
     */
    public int solution(int[] A) {

        int head = A[0];
        int tail = 0;

        for(int i=1;i<A.length;i++) {
            tail += A[i];
        }

        int minDiff = Math.abs(tail - head);

        for(int i=1;i<A.length-1;i++) {
            head += A[i];
            tail -= A[i];
            minDiff = Math.min(minDiff, Math.abs(tail-head));
            if (minDiff == 0) {
                break;
            }
        }

        return minDiff;
    }
}
