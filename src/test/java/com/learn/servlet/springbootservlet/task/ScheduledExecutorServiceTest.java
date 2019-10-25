
/*
 * <p>文件名称: ScheduledExecutorServiceTest</p>
 * <p>项目描述: KOCA 金证云原生平台 V1.0.0</p>
 * <p>公司名称: 深圳市金证科技股份有限公司</p>
 * <p>版权所有: 版权所有(C)2019-2020</p>
 */

package com.learn.servlet.springbootservlet.task;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.*;

/**
 * <p>一句话功能简述.</p>
 * <p>功能详细描述</p>
 *
 * @author zhangchao2
 * @version 1.0.0
 * @since 1.0.0, 2019/10/21
 */
public class ScheduledExecutorServiceTest {

//    @Test
//    public void testSchedule(){
//
//        ScheduledExecutorService threadPoolExecutor = new ScheduledThreadPoolExecutor(1, Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy() );
//        threadPoolExecutor.schedule(new CleanExpireTokenTask(), 60, TimeUnit.SECONDS);
//    }


    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService threadPoolExecutor = new ScheduledThreadPoolExecutor(1, Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy() );
        ScheduledFuture scheduledFuture = threadPoolExecutor.scheduleWithFixedDelay(new CleanExpireTokenTask(), 0, 10, TimeUnit.SECONDS);
        while(true) {
            System.out.println(scheduledFuture.isDone());
            Thread.sleep(1000 * 30 );
        }
    }
}
