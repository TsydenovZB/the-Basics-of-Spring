package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("jazzRap") Music music1, @Qualifier("retroWave") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusicList() {
        System.out.println("Playing " + music1.getSong());
        System.out.println("Playing " + music2.getSong());
    }
}
