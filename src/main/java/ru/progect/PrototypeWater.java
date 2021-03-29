package ru.progect;

import org.springframework.stereotype.Component;

@Component
public class PrototypeWater {
    public void hashOut(){
        System.out.println("Prototype : " + this.hashCode());
    }
}
