package com.jihan.javastudycode.cf.stack_queue;

import java.util.Stack;

public class BrowserEx {

    public static Stack<String> back = new Stack<>();
    public static Stack<String> forward = new Stack<>();

    public static void main(String[] args) {
        goURL("1.구글");
        goURL("2.네이버");
        goURL("3.넷플릭스");
        goURL("4.왓챠");

        printStatus();

        goBack();
        System.out.println("===== '뒤로' 버튼을 누른 후 =====");
        printStatus();

        goBack();
        System.out.println("===== '뒤로' 버튼을 누른 후 =====");
        printStatus();

        goForward();
        System.out.println("===== '앞으로' 버튼을 누른 후 =====");
        printStatus();

        goURL("5. 유투브");
        System.out.println("===== 새로운 주소로 이동 ====");
        printStatus();
    }

    public static void printStatus() {
        System.out.println("back: " + back);
        System.out.println("forward: " + forward);
        System.out.println("현재화면 '" + back.peek() + "'");
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }

    public static void goBack() {
        if (!back.empty())
            forward.push(back.pop());
    }

    public static void goForward() {
        if (!forward.empty())
            back.push(forward.pop());
    }

}
