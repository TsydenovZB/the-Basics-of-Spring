package org.example;

import org.springframework.stereotype.Component;

@Component
public class RetroWave implements Music {

    @Override
    public String getSong() {
        return "Real Hero";
    }
}
