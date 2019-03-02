package com.zj.singleton;

/**
 * 饿汉单例,无论这个类是否被使用，都会创建一个instance对象。如果这个创建过程很耗时，比如需要连接10000次数据库(夸张了…:-))，并且这个类还并不一定会被使用，那么这个创建过程就是无用的。怎么办呢？
 */
public class SingletonSimple {

    /**
     * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
     * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。
     * 如果从始至终从未使用过这个实例，则会造成内存的浪费。
     */

    //同时使用static和final修饰的成员在内存中只占据一段不能改变的存储空间。
    private  static  final SingletonSimple instance = new SingletonSimple();

    public static SingletonSimple getInstance(){
        return  instance;
    }

    private SingletonSimple(){  //它的构造方法是private的，这样就保证了只能有一个对象存在。

    }


    public void getInfo(){
        System.out.println("output message ");
    }


}
