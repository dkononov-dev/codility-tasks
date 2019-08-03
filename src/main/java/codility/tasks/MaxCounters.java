package codility.tasks;

public class MaxCounters {

    /**
     * Calculate the values of counters after applying all alternating operations.
     *
     * @param N number of counters.
     * @param A array of consecutive operations:
     *          if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase counter X by 1,
     *          if A[K] = N + 1 then operation K is set value of all counters to current maximum.
     * @return
     */
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        final int setAllCountersOperation = N + 1;

        int currentMax = 0;
        int lastSetAllCountersValue = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == setAllCountersOperation) {
                lastSetAllCountersValue = currentMax;
            }
            else {
                counters[A[i] - 1] = Math.max(lastSetAllCountersValue, counters[A[i] - 1]) + 1;
                currentMax = Math.max(currentMax, counters[A[i] - 1]);
            }
        }

        for (int j = 0; j < counters.length; j++) {
            counters[j] = Math.max(lastSetAllCountersValue, counters[j]);
        }

        return counters;
    }
}
