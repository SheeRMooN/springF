package ru.progect.musicType;

import org.springframework.beans.factory.annotation.Value;

public class Classic implements Music {
    @Value("${classic.text}")
    private String text;
    @Override
    public void play() {
        System.out.println("Play classic");
        System.out.println(text);
    }
}
