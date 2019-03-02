package com.zj.singleton;

/**
 * 优点：同上，但加锁了.
 *  缺点：synchronized 为独占排他锁，并发性能差。即使在创建成功以后，获取实例仍然是串行化操作。
 */
public class SingletonFullLazy {
    private static SingletonFullLazy instance = null;

    private SingletonFullLazy(){
        System.out.println("init");
    }

    // 同步方法
    public static synchronized SingletonFullLazy getInstance(){
        if(instance == null){
            instance = new SingletonFullLazy();
        }
        return instance;
    }



    /** 同步代码块
     * 假如一个线程进入了if (singleton == null)判断语句块，
     * 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
     * @return
     */
    public static SingletonFullLazy getInstance2() {
        if (instance == null) {
            synchronized (SingletonFullLazy.class) {
                instance = new SingletonFullLazy();
            }
        }
        return instance;
    }

    public void getInfo(){
        System.out.println("output message ");
    }
}
