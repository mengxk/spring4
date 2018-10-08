package com.example.config;

import com.example.object.knights.BraveKnight;
import com.example.object.knights.Knight;
import com.example.object.knights.Quest;
import com.example.object.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
