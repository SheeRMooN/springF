package ru.progect;

import org.springframework.stereotype.Component;

@Component
public class SingletonWater {
    public void hashOut(){
        System.out.println("Singleton : " + this.hashCode());
    }
}
