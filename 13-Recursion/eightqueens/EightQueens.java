package eightqueens;

public class EightQueens {
    public static void solve(PartialSolution input) {
        int exam = input.examine();

        if (exam == PartialSolution.ACCEPT) {
            System.out.println(input);
        } else if (exam != PartialSolution.ABANDON) {
            for (PartialSolution p : input.extend()) {
                solve(p);
            }
        }
    }

    public static void main(String[] args) {
        solve(new PartialSolution(0));
    }
}