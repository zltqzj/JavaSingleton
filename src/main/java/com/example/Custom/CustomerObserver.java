package com.example.Custom;

public class CustomerObserver implements Observer {

    //订阅者名字
    private String name;
    private int version;

    public CustomerObserver(String name){
        this.name = name;
    }

    @Override
    public void update(int version) {
        this.version=version;
        System.out.println("该杂志出新版本了");
        this.buy();
    }

    public void buy(){
        System.out.println(name+"知道了第"+version+"期的杂志出版了!");
    }
}
