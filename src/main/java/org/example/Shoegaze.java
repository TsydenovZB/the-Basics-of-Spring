package org.example;

import org.springframework.stereotype.Component;

@Component
public class Shoegaze implements Music {
    @Override
    public String getSong() {
        return "Shoegazer";
    }
}
