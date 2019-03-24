package com.example.observe;

import java.util.Observable;

public class OfficialAccount extends Observable {

    /**
     *
     * @param info  要给观察者的信息
     */
    public void publishNewInfo(String info){

        //标识这个Observable对象已经改变了，更具体来将就是把Observable中属性changed置为true.
        setChanged();
        //在通知所有观察者之前，需要判断Observable中属性changed是否为true，如若不为则不会发出通知。
        //具体可以看源码，蛮好理解的。
        notifyObservers(info);
    }

}
