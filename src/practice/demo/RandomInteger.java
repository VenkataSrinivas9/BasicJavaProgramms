package practice.demo;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/** Generate 10 random integers in the range 0..99. */
public final class RandomInteger {

    private static AtomicLong seed = new AtomicLong(9);
    public static final void main(String... aArgs) throws InterruptedException {
        log("Generating 10 random integers in range 0..99.");
        Random randomGenerator = new Random();
        // Random.setSeed(long) is used to produce the
        // same sequence of numbers every time
        randomGenerator.setSeed(9);
        for (int idx = 1; idx <= 15; ++idx) {
            // Random.nextInt(int) is used to output the random
            // number that is 0 < RandomNumber < 100
            int randomInt = randomGenerator.nextInt(100);
            log("Generated : " + randomInt);
            // Thread.sleep(500) is used for delay
            Thread.sleep(500);
        }

        log("Done.");
    }

    private static void log(String aMessage) {
        System.out.println(aMessage);
    }
}