package ru.progect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.progect.musicType.MusicPlayers;

public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

//        SingletonWater singletonWater = context.getBean("singletonWater", SingletonWater.class);
//        PrototypeWater prototypeWater = context.getBean("prototypeWater", PrototypeWater.class);
//
//        singletonWater.hashOut();
//        prototypeWater.hashOut();

        MusicPlayers musicPlayers = context.getBean("musicPlayers", MusicPlayers.class);
        musicPlayers.playMusic();
    }
}
