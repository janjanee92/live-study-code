package com.jihan.javastudycode.week14;

import java.util.*;

public class Generics {

    static <T extends Comparable<T>> long countGreaterThan(T[] arr, T elem) {
        return Arrays.stream(arr).filter(s -> s.compareTo(elem) > 0).count();
    }

    static class MyList<E, P> implements List<E> {

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<E> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(E e) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public E get(int index) {
            return null;
        }

        @Override
        public E set(int index, E element) {
            return null;
        }

        @Override
        public void add(int index, E element) {

        }

        @Override
        public E remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<E> listIterator() {
            return null;
        }

        @Override
        public ListIterator<E> listIterator(int index) {
            return null;
        }

        @Override
        public List<E> subList(int fromIndex, int toIndex) {
            return null;
        }
    }

    static void printList(List<Object> list) {
        list.forEach(s -> System.out.println(s));
    }

    static void printList2(List<?> list) {
        list.forEach(s -> System.out.println(s));
    }

    public static void main(String[] args) {

        Integer i = 10;
        Number n = i;

        // List<T> 이므로 정확히 매치되는 타입 피라미터 일때만 가능하다.
        List<Integer> intList = new ArrayList<>();
        // List<Number> numberList = intList;

        // super 타입은 가능하다.
        ArrayList<Integer> arrList = new ArrayList<>();
        List<Integer> intList2 = arrList;

        List<String> l1 = new MyList<String, Integer>();
        List<String> l2 = new MyList<String, String>();

        List<Integer> list = new ArrayList<>();
        // printList(list);
        printList2(list);


    }
}
