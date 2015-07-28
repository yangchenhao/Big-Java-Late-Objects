/*Simulate a tally counter that can be used to admit a limited number of people. First,
the limit is set with a call
public void setLimit(int maximum)
If the count button was clicked more often than the limit, simulate an alarm by
printing out a message “Limit exceeded”.*/

public class P8_02 {
    private int value;
    private int limit;

    public int getValue() {
        return this.value;
    }

    public void setLimit(int maximum) {
        this.limit = maximum;
    }

    public void count() {
        if (this.value == this.limit) {
            System.out.println("Limit exceeded");
        } else {
            this.value = this.value + 1;
        }
    }

    public void undo() {
        if (this.value > 0) {
            this.value -= 1;
        } else {
            this.value = 0;
        }
    }

    public void reset() {
        this.value = 0;
    }
}