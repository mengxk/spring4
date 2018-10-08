package com.example.service.impl;

import com.example.service.CDPlayerService;
import org.springframework.stereotype.Component;

@Component
public class CDPlayerServiceImpl implements CDPlayerService {
    @Override
    public void play() {
        System.out.println("play");
    }
}
