package com.zhuwuhui.utils;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentThreadUtils {

    /**
     * 创建线程池
     *
     * @param size       线程池大小应小于Runtime.getRuntime().availableProcessors() + 1
     * @param queueSize  阻塞队列大小应不小于任务数量，不然任务会被拒绝
     * @param threadName 指定线程名称
     */
    public static ExecutorService getThreadPool(int size, int queueSize, String threadName) {

        int maximumPoolSize = Runtime.getRuntime().availableProcessors() + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(size, maximumPoolSize, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(queueSize), new ThreadFactory() {
            private final AtomicInteger atomicInteger = new AtomicInteger(0);
            private final String tName = threadName;

            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, tName + atomicInteger.incrementAndGet());
            }
        });
        return threadPoolExecutor;
    }

    /**
     * 关闭线程池
     * 任务提交完毕后必须关闭线程池
     *
     * @param threadPool 线程池
     */
    public static void shutdownPool(ExecutorService threadPool) {
        //停止提交任务，待所有任务执行完成后关闭线程池
        threadPool.shutdown();
        try {
            //所有任务运行时长不得多于8小时
            if (!threadPool.awaitTermination(8, TimeUnit.HOURS)) {
                threadPool.shutdownNow();
                if (!threadPool.awaitTermination(8, TimeUnit.HOURS)) {
                    //打印日志
                }
            }
        } catch (InterruptedException e) {
            threadPool.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

}
