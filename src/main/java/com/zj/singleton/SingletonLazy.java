package com.zj.singleton;

/**
 * 懒汉单例,lazy load,
 * 线程A希望使用SingletonClass，调用getInstance()方法。因为是第一次调用，
 * A就发现instance是null的，于是它开始创建实例，就在这个时候，CPU发生时间片切换，
 * 线程B开始执行，它要使用SingletonClass，调用getInstance()方法，同样检测到instance是null——注意，
 * 这是在A检测完之后切换的，也就是说A并没有来得及创建对象——因此B开始创建。B创建完成后，切换到A继续执行，
 * 因为它已经检测完了，所以A不会再检测一遍，它会直接创建对象。这样，线程A和B各自拥有一个SingletonClass的对象——单例失败！
 *
 * 优点：懒加载启动快，资源占用小，使用时才实例化，无锁。
 * 缺点：非线程安全。
 */
public class SingletonLazy {

    private static SingletonLazy instance = null;

    private SingletonLazy(){
        System.out.println("init");
    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void getInfo(){
        System.out.println("output message ");
    }
}
