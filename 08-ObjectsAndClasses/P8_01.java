/*We want to add a button to the tally counter in Section 8.2 that allows an operator to
undo an accidental button click. Provide a method public void undo()
that simulates such a button. As an added precaution, make sure that the operator
cannot click the undo button more often than the count button.*/

public class P8_01 {
    private int value;

    public int getValue() {
        return this.value;
    }

    public void count() {
        this.value = this.value + 1;
    }

    public void reset() {
        this.value = 0;
    }

    public void undo() {
        if (this.value > 0) {
            this.value -= 1;
        } else {
            this.value = 0;
        }
    }
}