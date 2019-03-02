package com.zj.singleton;

public class SingletonDoubleCheckLock {

    private static SingletonDoubleCheckLock instance = null;

    private SingletonDoubleCheckLock(){
        System.out.println("init");
    }

    /**
     * 双重检查加锁double check lock
     * @return
     */
    public static  SingletonDoubleCheckLock getInstance(){

        if (instance == null){
            synchronized(SingletonDoubleCheckLock.class){
                if(instance == null){
                    instance = new SingletonDoubleCheckLock();
                }
            }
        }
        return instance;
    }

    public void getInfo(){
        System.out.println("output message ");
    }

}
