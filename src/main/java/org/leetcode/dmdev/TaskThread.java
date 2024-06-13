package org.leetcode.dmdev;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class TaskThread {

    public static void main(String[] args) {
        int[] values = new int[100_000_000];
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(301);
        }
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("cores: " + cores);

        try (ExecutorService executorService = Executors.newWorkStealingPool()) {
            trackTime(() -> {
                        try {
                            return findMaxParallel(values, executorService);

                        } catch (ExecutionException | InterruptedException e) {
                            e.printStackTrace();
                        }
                        return Integer.MAX_VALUE;
                    },
                    "Parallel");
            trackTime(() -> findMax(values), "Line");
        }
    }

    private static int trackTime(Supplier<Integer> task, String name) {
        long startTime = System.currentTimeMillis();
        int result = task.get();
        System.out.println(name + ": " + result + ": " + (System.currentTimeMillis() - startTime));
        return result;
    }

    private static int findMax(int[] values) {
        return IntStream.of(values)
                .max()
                .orElse(Integer.MAX_VALUE);
    }

    private static int findMaxParallel(int[] values, ExecutorService executorService) throws ExecutionException, InterruptedException {
        return executorService.submit(() -> IntStream.of(values)
                        .parallel().max().orElse(Integer.MAX_VALUE))
                .get();
    }
}
