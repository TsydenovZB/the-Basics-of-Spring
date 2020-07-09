package org.example.genre;

import org.example.Music;
import org.springframework.stereotype.Component;

@Component
public class RetroWave implements Music {

    @Override
    public String getSong() {
        return "Real Hero";
    }
}
