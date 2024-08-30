package array_list;

import java.util.ArrayList;
import java.util.Arrays;

class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
    }

    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
        this.elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2 + 1);
        }

        System.arraycopy(elements, index, elements, index + 1, size - index);

        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        @SuppressWarnings("unchecked")
        E removedElement = (E) elements[index];

        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }

        elements[--size] = null;

        return removedElement;
    }

    public int size() {
        return size;
    }

    public E clone(){
        try {
            // Ensure the element type E is cloneable
            if (this instanceof Cloneable) {
                return (E) super.clone();
            } else {
                throw new CloneNotSupportedException("This object does not implement Cloneable.");
            }
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone the object.", e);
        }
    }

    public boolean contains(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(size * 2 + 1);
        }
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, minCapacity);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public E get(int i){
        if (i >= 0 && i < size) {
            return (E) elements[i];
        } else {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
    }

    public void clear(){
        size = 0;
        Arrays.fill(elements, null);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
