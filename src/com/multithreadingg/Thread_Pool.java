package com.multithreadingg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 15; i++) {
            Runnable task = new WorkerTask("task " + i);
            executor.execute(task);
        }

        executor.shutdown();
    }
}

    class WorkerTask implements Runnable{

        private String taskName;

        WorkerTask(String taskName){
            this.taskName = taskName;
        }
        @Override
        public void run() {
            System.out.println(taskName + " is executing by " + Thread.currentThread().getName());
            try{
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(taskName + " is completed by " + Thread.currentThread().getName());
        }
    }

