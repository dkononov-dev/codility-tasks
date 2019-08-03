package codility.tasks;

public class FrogRiverOne {

    /**
     * Find the earliest time when a frog can jump to the other side of a river (position 0).
     *
     * @param X the opposite bank of the river is position X+1.
     * @param A array consisting of N integers representing the falling leaves.
     *          A[K] represents the position where one leaf falls at time K, measured in seconds.
     * @return the earliest time when the frog can jump to the other side of the river.
     */
    public int solution(int X, int[] A) {

        int[] position = new int[X + 1];

        for (int time = 0; time < A.length; time++) {
            int nextPosition = A[time];

            if (nextPosition < position.length) {
                if (position[nextPosition] == 0) {
                    position[nextPosition] = time + 1;
                }
            }
        }

        int maxTime = 0;
        for (int pos = 1; pos < position.length; pos++) {
            if (position[pos] == 0) {
                return -1;
            }
            maxTime = Math.max(maxTime, position[pos]);
        }

        return maxTime - 1;
    }
}
