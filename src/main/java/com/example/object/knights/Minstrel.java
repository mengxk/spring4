package com.example.object.knights;

import java.io.PrintStream;

public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("探险之前使用");
    }

    public void singAfterQuest() {
        stream.println("探险之后使用");
    }
}
