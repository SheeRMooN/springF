package ru.progect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.progect.musicType.*;

import java.util.LinkedList;
import java.util.List;

@Configuration
//@ComponentScan("ru/progect")
@PropertySource("classpath:spring.properties")
public class SpringConfig {

    @Bean
    public Rock rock(){
        return new Rock();
    }
    @Bean
    public Classic classic(){
        return new Classic();
    }
    @Bean
    public Jazz jazz(){
        return new Jazz();
    }
    @Bean
    public MusicPlayers musicPlayers(){
        List<Music> musicList = new LinkedList<>();
        musicList.add(rock());
        musicList.add(classic());
        musicList.add(jazz());
        return new MusicPlayers(musicList);
    }
}

