package codility.tasks;

public class PassingCars {

    /**
     * Count the number of passing cars on the road.
     * A pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.
     *
     * @param A array of N 0s and/or 1s which represent consecutive cars on a road:
     *          0 represents a car traveling east,
     *          1 represents a car traveling west.
     * @return count of passing cars, or −1 if the number of pairs of passing cars exceeds 1,000,000,000.
     */
    public int solution(int[] A) {

        int[] goingWestPrefixSum = new int[A.length];

        int goingWestTotal = 0;
        for (int i = 0; i < A.length; i++) {
            goingWestPrefixSum[i] = goingWestTotal + A[i];
            goingWestTotal = goingWestPrefixSum[i];
        }

        int passingPairs = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == 0) {
                passingPairs += (goingWestTotal - goingWestPrefixSum[i]);

                if (passingPairs > 1000000000) {
                    return -1;
                }
            }
        }

        return passingPairs;
    }
}
