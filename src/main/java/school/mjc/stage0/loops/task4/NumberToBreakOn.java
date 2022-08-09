package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith < numberToGoUntil){
            for (int i = 1; i <= toBreakWith; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("iterating till the end");
            for (int i = 1; i <= numberToGoUntil; i++) {
                for (int j = 1; j <= numberToGoUntil; j++) {
                    System.out.println(j);
                }
                break;
            }
        }
    }
}
