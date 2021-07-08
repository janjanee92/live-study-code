package com.jihan.javastudycode.cf.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HistoryQueue {
    static Queue<String> q = new LinkedList<>();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {

        while(true) {
            System.out.print(">>");

            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim();

            if("".equals(input)) continue;

            if(input.equalsIgnoreCase("q")) {
                System.exit(0);
            } else if (input.equalsIgnoreCase("help")) {
                System.out.println(" help - 도움말을 보여줍니다.");
                System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
            } else if (input.equalsIgnoreCase("history")) {
                int i = 0;
                save(input);

                LinkedList<String> tmp = (LinkedList<String>) q;
                for (String t : tmp) {
                    System.out.println(++i + "." + t);
                }
            } else {
                save(input);
                System.out.println(input);
            }
        }

    }

    private static void save(String input) {
        if (!"".equals(input))
            q.offer(input);

        if (q.size() > MAX_SIZE)
            q.remove();
    }
}
