/*Implement a VotingMachine class that can be used for a simple election. Have meth­ods
to clear the machine state, to vote for a Democrat, to vote for a Republican, and to
get the tallies for both parties.*/

public class P8_10 {
    private int voteForDemocrat;
    private int voteForRepublican;

    public void clear() {
        this.voteForDemocrat = 0;
        this.voteForRepublican = 0;
    }

    public void voteDemocrats() {
        this.voteForDemocrat += 1;
    }

    public void voteRepublicans() {
        this.voteForRepublican += 1;
    }

    public void showVotes() {
        System.out.println("Democrats:" + this.voteForDemocrat);
        System.out.println("Republicans: " + this.voteForRepublican);
    }
}