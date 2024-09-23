import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final int NUM_INTS = 50000;
    static final int EXP_COUNT = 50;
    public static void main(String[] args) {
        for (int i = 0; i < EXP_COUNT; i++) {
            /*
            You can get the current time from the System class
            either in nanoseconds or milliseconds
             */
            int[] randomArr = createRandomArr();

            long startTime = System.nanoTime();
            Arrays.sort(randomArr);
            long endTime = System.nanoTime();

            long elapsedTime = endTime - startTime;
            System.out.println(elapsedTime);
        }
    }

    static int[] createRandomArr() {
        int[] arr = new int[NUM_INTS];
        Random rng = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rng.nextInt();
        }
        return arr;
    }

}
