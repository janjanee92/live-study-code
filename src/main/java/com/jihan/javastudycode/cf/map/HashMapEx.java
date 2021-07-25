package com.jihan.javastudycode.cf.map;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("춘식이", 100);
        map.put("라이언", 80);
        map.put("짱구", 60);
        map.put("호빵맨", 77);

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        for (Map.Entry<String, Integer> entry : set) {
            System.out.println("이름: " + entry.getKey() + ", 점수: " + entry.getValue());
        }

        Set<String> keySet = map.keySet();
        System.out.println("이름 목록: " + keySet);

        Collection<Integer> values = map.values();

        System.out.println("최댓값: " + Collections.max(values));
        System.out.println("최솟값 : " + Collections.min(values));

    }
}
