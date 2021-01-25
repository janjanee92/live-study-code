package com.jihan.javastudycode.week9;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        }
    }

    private static void install() throws InstallException {
        try {
            startInstall();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치중 예외발생");
            ie.initCause(se);
            throw ie;
        }

    }

    private static void startInstall() throws SpaceException {
        if(!enoughSpace())
            throw new SpaceException("설치할 공간이 부족");

        if(!enoughMemory())
            throw new RuntimeException(new MemoryException("메모리 부족")) ;
    }

    private static boolean enoughMemory() {
        return false;
    }

    private static boolean enoughSpace() {
        return false;
    }

}

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}