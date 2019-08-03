package codility.tasks;

/*
 * https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
 */
public class GenomicRangeQuery {
    public int[] solution(String dnaSequence, int[] P, int[] Q) {

        int dnaSequenceLen = dnaSequence.length() + 1;
        int[] A = new int[dnaSequenceLen];
        int[] C = new int[dnaSequenceLen];
        int[] G = new int[dnaSequenceLen];

        int[] impact = new int[P.length];

        int prefixSumA = 0;
        int prefixSumC = 0;
        int prefixSumG = 0;

        A[0] = 0;
        C[0] = 0;
        G[0] = 0;

        for (int i = 1; i < dnaSequenceLen; i++) {
            switch (dnaSequence.charAt(i - 1)) {
                case 'A':
                    prefixSumA++;
                    break;
                case 'C':
                    prefixSumC++;
                    break;
                case 'G':
                    prefixSumG++;
                    break;
                default:
                    break;
            }

            A[i] = prefixSumA;
            C[i] = prefixSumC;
            G[i] = prefixSumG;
        }

        for (int i = 0; i < P.length; i++) {
            int queryStart = P[i];
            int queryEnd = Q[i] + 1;

            if (A[queryEnd] > A[queryStart]) {
                impact[i] = 1;
            }
            else if (C[queryEnd] > C[queryStart]) {
                impact[i] = 2;
            }
            else if (G[queryEnd] > G[queryStart]) {
                impact[i] = 3;
            }
            else {
                impact[i] = 4;
            }
        }

        return impact;
    }
}
