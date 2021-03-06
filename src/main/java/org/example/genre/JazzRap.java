package org.example.genre;

import org.example.Music;
import org.springframework.stereotype.Component;

@Component
public class JazzRap implements Music {
    private JazzRap() {}

    public static JazzRap getJazzRap() {
        return new JazzRap();
    }

    public void doJazzRapInit() {
        System.out.println("JazzRap is created");
    }
    public void doJazzRapDestroy() {
        System.out.println("JazzRap is destroyed");
    }

    @Override
    public String getSong() {
        return "DEATH NINJA";
    }
}
