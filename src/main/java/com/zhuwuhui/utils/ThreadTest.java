package com.zhuwuhui.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ThreadTest {

    public void test(){
        ExecutorService threadPoolExecutor = ConcurrentThreadUtils.getThreadPool(8, 500, "线程");
        List<Future<String>> tasks = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            Future<String> future = threadPoolExecutor.submit(new Callable<String>() {

                @Override
                public String call() throws Exception {
                    String result = null;

                    System.out.println("猪无悔= " + Thread.currentThread().getName());

                    return result;
                }
            });
            tasks.add(future);
        }
        ConcurrentThreadUtils.shutdownPool(threadPoolExecutor);
        for (Future task : tasks) {
            try {
                Object ret = task.get();
            } catch (Exception e) {

            }
        }
    }
}
