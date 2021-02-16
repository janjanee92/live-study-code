package com.jihan.javastudycode.week13;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

public class PipedReaderWriter {
    public static void main(String[] args) {
        InputThread inputThread = new InputThread("InputThread");
        OutputThread outputThread = new OutputThread("OutputThread");

        // PipedReader와 PipedWriter 연결
        inputThread.connect(outputThread.getOutput());

        inputThread.start();
        outputThread.start();

    }
}

class InputThread extends Thread {
    PipedReader input = new PipedReader();
    StringWriter sw = new StringWriter();

    InputThread (String name) {
        super(name);            // Thread(String name);
    }

    @Override
    public void run() {
        try {
            int data;

            while((data = input.read()) != -1) {
                sw.write(data);
            }

            System.out.println(getName() + " received : " + sw.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public PipedReader getInput() {
        return input;
    }

    public void connect (PipedWriter output) {
        try {
            input.connect(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class OutputThread extends Thread {
    PipedWriter output = new PipedWriter();

    OutputThread(String name){
        super(name);
    }

    @Override
    public void run() {
        try{
            String msg = "Hello";
            System.out.println(getName() + " sent : " + msg);
            output.write(msg);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PipedWriter getOutput() {
        return output;
    }

    public void connect(PipedReader input) {
        try {
            output.connect(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

