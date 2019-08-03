package codility.tasks;

/**
 *
 */
public class OddOccurrencesInArray {

    /**
     * Find value that occurs in odd number of elements.
     * @param A non-empty array consisting of N integers
     * @return value that occurs in odd number of elements
     */
    public int solution(int[] A){
        int oddValue = 0;
        for(int a:A) oddValue ^= a;
        return oddValue;
    }
}
