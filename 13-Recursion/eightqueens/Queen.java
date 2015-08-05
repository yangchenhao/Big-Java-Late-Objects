package eightqueens;

public class Queen {
    private int row;
    private int column;

    public Queen(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean attacks(Queen other) {
        return this.row == other.row || this.column == other.column ||
               Math.abs(this.row - other.row) == Math.abs(this.column - other.column);
    }

    @Override
    public String toString() {
        return "" + "abcdefgh".charAt(this.column) + (this.row + 1);
    }
}