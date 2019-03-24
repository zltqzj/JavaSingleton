package com.example.observe;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        System.out.println("微信用户："+name+"，您的微信公众号更新这些内容："+arg);
    }

}
