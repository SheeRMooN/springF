package ru.progect.musicType;

import java.util.List;

public class MusicPlayers {
     private List<Music> musicList;

    public MusicPlayers(List<Music> musicList) {
        this.musicList = musicList;
    }
    public void playMusic(){
        for (Music music: musicList){
            music.play();
        }
    }
}
