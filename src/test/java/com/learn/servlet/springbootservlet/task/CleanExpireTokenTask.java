package com.learn.servlet.springbootservlet.task;

import java.security.SecureRandom;
import java.util.Random;

public class CleanExpireTokenTask implements  Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " : " + System.currentTimeMillis());
            SecureRandom random = new SecureRandom();
            try {
                int randomNum = random.nextInt(10);
                Thread.sleep(randomNum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + System.currentTimeMillis() + "end");
        }
    }