package codility.tasks;

public class BinaryGap {

    /**
     * Find longest sequence of zeros in binary representation of an integer.
     * @param N  an integer within the range [1..2,147,483,647].
     * @return any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N
     */
    public int solution(int N) {

        int maxGap = 0;
        boolean foundGap=false;
        for (int shiftedNum = N, currentGap=0;
             shiftedNum > 0;
             shiftedNum = shiftedNum >> 1) {
            if ((shiftedNum & 1) == 1) {
                if (!foundGap) {
                    foundGap=true;
                } else {
                    maxGap = Math.max(maxGap, currentGap);
                }
                currentGap = 0;
            } else {
                currentGap++;
            }
        }

        return maxGap;
    }
}
