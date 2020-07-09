package org.example.genre;

import org.example.Music;
import org.springframework.stereotype.Component;

@Component
public class Shoegaze implements Music {
    @Override
    public String getSong() {
        return "Shoegazer";
    }
}
