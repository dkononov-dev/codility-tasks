package codility.tasks;

public class PermMissingElem {
    /**
     * Find the missing element in a given permutation.
     * @param A array of N different integers in the range [1..(N + 1)], which means that exactly one element is missing.
     * @return missing element
     */
    public int solution(int[] A) {
        int result = A.length + 1;
        for (int i=0; i<A.length; i++) {
            result ^= A[i] ^ (i + 1);
        }
        return result;
    }
}
