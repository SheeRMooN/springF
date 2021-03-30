package ru.progect.musicType;

import org.springframework.beans.factory.annotation.Value;

public class Jazz implements Music {
    @Value("${jazz.text}")
    private String text;
    @Override
    public void play() {
        System.out.println("Play jazz");
        System.out.println(text);
    }
}
