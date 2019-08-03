package codility.tasks;

public class BinaryGap {

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
