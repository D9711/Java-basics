import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import javax.xml.crypto.Data;

/**
 * A singly linked list.
 * 
 * @author (Daniel Parmhed)
 * @version (2023-01-26)
 */
public class LinkedList<T> implements Stack<T> {
    private ListElement<T> first; // First element in list.
    private ListElement<T> last; // Last element in list.
    private int size; // Number of elements in list.

    /**
     * A list element.
     */
    private static class ListElement<T> {
        public T data;
        public ListElement<T> next;

        public ListElement(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Creates an empty list.
     */
    public LinkedList() {

        this.first = null;
        this.last = null;
        this.size = 0;

    }

    /**
     * Inserts the given element at the beginning of this list.
     *
     * @param element An element to insert into the list.
     */
    public void addFirst(T element) {

        ListElement<T> randomElement = new ListElement<T>(element);

        if (last == null && first == null) {

            last = randomElement;
            first = randomElement;

        } else if (last != null && first != null) {

            randomElement.next = first;

        }

        first = randomElement;
        size++;

    }

    /**
     * Inserts the given element at the end of this list.
     *
     * @param element An element to insert into the list.
     */
    public void addLast(T element) {

        ListElement<T> randomElement = new ListElement<T>(element);

        if (last == null) {

            last = randomElement;
            first = randomElement;

        } else if (last != null) {

            last.next = randomElement;

        }

        last = randomElement;
        size++;

    }

    /**
     * @return The head of the list.
     * @throws NoSuchElementException if the list is empty.
     */
    public T getFirst() {

        if (first == null) {

            throw new NoSuchElementException();

        } else {

            return first.data;

        }

    }

    /**
     * @return The tail of the list.
     * @throws NoSuchElementException if the list is empty.
     */
    public T getLast() {

        if (last == null) {

            throw new NoSuchElementException();

        } else {

            return last.data;

        }
    }

    /**
     * Returns an element from a specified index.
     *
     * @param index A list index.
     * @return The element at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of bounds.
     */
    public T get(int index) {

        if (index > size - 1 || index < 0) {

            throw new IndexOutOfBoundsException();
        }

        ListElement<T> temp = first;

        for (int i = 0; i < index; i++) {

            temp = temp.next;
        }

        return temp.data;
    }

    /**
     * Removes the first element from the list.
     *
     * @return The removed element.3
     * @throws NoSuchElementException if the list is empty.
     */
    public T removeFirst() {

        ListElement<T> removedElement = first;

        if (first == null) {

            throw new NoSuchElementException();

        } else if (first == last) {

            this.first = null;
            this.last = null;
            this.size--;

        } else {

            ListElement<T> temp = first.next;
            this.first = temp;

            this.size--;

        }

        return removedElement.data;

    }

    /**
     * Removes all of the elements from the list.
     */
    public void clear() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    /**
     * @return The number of elements in the list.
     */
    public int size() {
        if (first == null && last == null) {

            return 0;

        } else {

            return size;
        }
    }

    /**
     * Note that by definition, the list is empty if both first and last
     * are null, regardless of what value the size field holds (it should
     * be 0, otherwise something is wrong).
     *
     * @return <code>true</code> if this list contains no elements.
     */
    public boolean isEmpty() {
        return first == null && last == null;
    }

    /**
     * Creates a string representation of this list. The string
     * representation consists of a list of the elements enclosed in
     * square brackets ("[]"). Adjacent elements are separated by the
     * characters ", " (comma and space). Elements are converted to
     * strings by the method toString() inherited from Object.
     *
     * Examples:
     * "[1, 4, 2, 3, 44]"
     * "[]"
     *
     * @return A string representing the list.
     */
    public String toString() {

        ListElement<T> temp = first;
        String toStringTemp = "";

        for (int i = 0; i < size; i++) {

            if (i == size - 1) {

                toStringTemp += temp.data;

            } else {

                toStringTemp += temp.data + ", ";
                temp = temp.next;

            }
        }

        return "[" + toStringTemp + "]";
    }

    @Override
    public T pop() {

        if (first == null) {

            throw new EmptyStackException();
        } else {

            return removeFirst();
        }

    }

    @Override
    public T top() {

        if (first == null) {

            throw new EmptyStackException();

        } else {

            return getFirst();

        }
    }

    @Override
    public void push(T elem) {

        addFirst(elem);

    }

}
