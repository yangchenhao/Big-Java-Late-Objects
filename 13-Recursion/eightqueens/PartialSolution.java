package eightqueens;

import java.util.Arrays;

public class PartialSolution {
    private static final int NQUEENS = 8;
    public static final int ACCEPT = 1;
    public static final int ABANDON = 2;
    public static final int CONTINUE = 3;

    private Queen[] queens;

    public PartialSolution(int size) {
        this.queens = new Queen[size];
    }

    public int examine() {
        for (int i = 0; i < this.queens.length; i++) {
            for (int j = i + 1; j < this.queens.length; j++) {
                if (this.queens[i].attacks(this.queens[j])) {
                    return ABANDON;
                }
            }
        }

        if (this.queens.length == NQUEENS) {
            return ACCEPT;
        } else {
            return CONTINUE;
        }
    }

    public PartialSolution[] extend() {
        PartialSolution[] result = new PartialSolution[NQUEENS];

        for (int i = 0; i < result.length; i++) {
            int size = this.queens.length;
            result[i] = new PartialSolution(size + 1);

            for (int j = 0; j < size; j++) {
                result[i].queens[j] = this.queens[j];
            }

            result[i].queens[size] = new Queen(size, i);
        }

        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.queens);
    }
}