package com.jihan.javastudycode.week8;

public class TVCR extends Tv implements IVCR{
    VCR vcr = new VCR();

    @Override
    public void play() {
        vcr.play();
    }

    @Override
    public void stop() {
        vcr.stop();
    }

    @Override
    public void reset() {
        vcr.reset();
    }

    @Override
    public int getCounter() {
        return vcr.getCounter();
    }

    @Override
    public void setCounter(int c) {
        vcr.setCounter(c);
    }

    public static void main(String[] args) {
        TVCR tvcr = new TVCR();
        tvcr.play();
    }
}
