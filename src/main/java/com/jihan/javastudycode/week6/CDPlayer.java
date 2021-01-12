package com.jihan.javastudycode.week6;

public class CDPlayer extends Player {
    int currentTrack;

    void nextTrack() {
        currentTrack ++;
    }

    void preTrack() {
        if(currentTrack > 1) {
            currentTrack --;
        }
    }

    @Override
    void play(int pos) {
    }

    @Override
    void stop() {

    }
}
