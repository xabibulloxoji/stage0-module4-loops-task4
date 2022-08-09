package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        if (numberToSkip < lastInRow && lastInRow > 0) {
            for (int i = numberToSkip + 1; i <= lastInRow; i++) {
                sum += i;
            }
            System.out.println("skipped sum is " + (numberToSkip + lastInRow));
            System.out.println("counted sum is " + sum);
            return;
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        } else if (numberToSkip == lastInRow) {
            for (int i = 0; i <= lastInRow; i++) {
                sum += i;
            }
            System.out.println("skipped sum is " + sum);
            System.out.println("counted sum is 0");
            return;
        }
    }
}
