package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        if (lastPrinted < 0) {
            System.out.print("");
            return;
        }
        for (int i = 0; i <= lastPrinted; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }
}
