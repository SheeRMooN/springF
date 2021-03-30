package ru.progect.musicType;

import org.springframework.beans.factory.annotation.Value;

public class Rock implements Music{
    @Value("${rock.text}")
    private String text;
    @Override
    public void play() {
        System.out.println("Play rock");
        System.out.println(text);
    }
}
