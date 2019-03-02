package com.zj.singleton;

public class SingletonTest {
    public static void main(String[] args) {

//        SingletonSimple singletonSimple = SingletonSimple.getInstance();
//        SingletonSimple singletonSimple1 = SingletonSimple.getInstance();
//
//        singletonSimple.getInfo();
//        singletonSimple1.getInfo();
//
//
//
//
//
//        System.out.println( "-----------" );
//        //SingletonLazy singleton11 =  new SingletonLazy(); //
//        SingletonLazy singleton1= SingletonLazy.getInstance(); // new SingletonLazy(); //
//
//        SingletonLazy singleton2 = SingletonLazy.getInstance();
//        if (singleton1 == singleton2){
//            singleton1.getInfo();
//            singleton2.getInfo();
//        }

        SingletonInternalStatic.getInfo();
        SingletonInternalStatic singletonInternalStatic = SingletonInternalStatic.getInstance();
        singletonInternalStatic.getInfo();
    }
}
