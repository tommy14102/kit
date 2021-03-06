package com.lnwazg.kit.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;

import com.lnwazg.kit.taskman.CallableTask;
import com.lnwazg.kit.taskman.TaskManager;

/**
 * 公共的Executor管理器<br>
 * 优势依然是开箱即用
 * @author Administrator
 * @version 2016年4月15日
 */
public class ExecMgr
{
    /**
     * 多线程（无上限限制）的线程池
     */
    public static ExecutorService cachedExec = Executors.newCachedThreadPool();
    
    /**
     * 限定数量的线程池
     */
    public static ExecutorService fixedExec6 = Executors.newFixedThreadPool(6);
    
    public static ExecutorService fixedExec7 = Executors.newFixedThreadPool(7);
    
    public static ExecutorService fixedExec8 = Executors.newFixedThreadPool(8);
    
    public static ExecutorService fixedExec9 = Executors.newFixedThreadPool(9);
    
    public static ExecutorService fixedExec10 = Executors.newFixedThreadPool(10);
    
    public static ExecutorService fixedExec5 = Executors.newFixedThreadPool(5);
    
    public static ExecutorService fixedExec4 = Executors.newFixedThreadPool(4);
    
    public static ExecutorService fixedExec3 = Executors.newFixedThreadPool(3);
    
    public static ExecutorService fixedExec2 = Executors.newFixedThreadPool(2);
    
    /**
     * 单线程的线程池
     */
    public static ExecutorService singleExec = Executors.newSingleThreadExecutor();
    
    /**
     * sqlite单线程写入的线程池
     */
    public static ExecutorService sqliteWriteExec = Executors.newSingleThreadExecutor();
    
    /**
     * 提供相同的操作接口质感(相对于newCachedThreadPool等等通用线程池)<br>
     * 但是，该线程池是针对Swing GUI程序所量身定制的！是gui开发者的神器！
     */
    public static ExecutorService guiExec = GuiExecutor.getInstance();
    
    /**
     * 一个任务管理器<br>
     * 其特色在于cleanAndAdd()方法，此特性可以用作一个仅允许最近添加的任务可以被执行的任务管理器
     */
    public static TaskManager<Void, CallableTask> taskManager = new TaskManager<Void, CallableTask>();
    
    /**
     * 可以运行定时任务的线程池<br>
     * 线程池中仅有1个活跃线程
     */
    public static ScheduledExecutorService scheduledExec = Executors.newScheduledThreadPool(1);
    
    /**
     * 可以运行定时任务的线程池<br>
     * 线程池中有2个活跃线程
     */
    public static ScheduledExecutorService scheduledExec2 = Executors.newScheduledThreadPool(2);
    
    /**
     * forkJoin运行池
     */
    public static ForkJoinPool forkJoinPool = new ForkJoinPool();
    
    /**
     * 启动一个后台线程
     * @author nan.li
     * @param runnable
     */
    public static void startDaemenThread(Runnable runnable)
    {
        Thread daemonThread = new Thread(runnable);
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
