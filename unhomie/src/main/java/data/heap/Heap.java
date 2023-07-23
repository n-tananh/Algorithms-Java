package data.heap;

import java.util.Arrays;

public abstract class Heap {
    protected int capacity = 10;

    protected int size = 0;

    protected int[] items = new int[capacity];

    public abstract int peek();

    public abstract int poll();

    public abstract void add(int item);

    public abstract void heapifyUp();

    public abstract void heapifyDown();

    protected void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    protected void ensureExtraCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    protected int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    protected int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    protected int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    protected boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    protected boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    protected boolean hasParent(int index) {
        return getParentIndex(index) < size;
    }

    protected int leftChild(int index) {
        return items[getLeftChildIndex(index)];
    }

    protected int rightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    protected int parent(int index) {
        return items[getParentIndex(index)];
    }
}
