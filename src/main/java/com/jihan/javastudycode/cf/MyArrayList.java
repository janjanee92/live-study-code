package com.jihan.javastudycode.cf;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List {
    Object[] elementData = null;
    private int capacity = 0;
    private int size = 0;

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("유효하지 않은 capacity 값 : " + initialCapacity);

        this.capacity = initialCapacity;
        elementData = new Object[initialCapacity];
    }

    public MyArrayList() {
        this(10);
    }

    public boolean add(Object obj) {
        ensureCapacity(size + 1);
        elementData[size++] = obj;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity - elementData.length > 0)
            setCapacity(minCapacity);
    }

    private void setCapacity(int capacity) {
        if(this.capacity == capacity) return;

        Object[] tmp = new Object[capacity];
        System.arraycopy(elementData, 0, tmp, 0, size);
        elementData = tmp;
        this.capacity = capacity;
    }

    public Object get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        return elementData[index];
    }

    public Object remove(int index) {
        Object oldObj;

        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        oldObj = elementData[index];

        if (index != size - 1)
            System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);

        elementData[size - 1] = null;
        size--;
        return oldObj;
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < size; i++) {
            if(obj.equals(elementData[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++)
            elementData[i] = null;
        size = 0;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(elementData, 0, result, 0, size);

        return result;
    }

    public boolean isEmpty() { return size == 0; }
    public int capacity() { return capacity; }
    public int size() { return size; }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

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
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}