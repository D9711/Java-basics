
/**
 * The Interface Stack is a blueprint to build a Stack containing the methods push which takes an element as parameter
 * to be pushed onto the stack. The method pop which removes the last added element and returns its value.
 * The method top which returns the last added element. Int size which returns the size of the stack (number of elements).
 * And last method isEmpty which checks if the stack is empty.
 * 
 * All types are generics.
 * 
 *
 * @author Daniel Parmhed
 * @version 2023-02-01
 */

interface Stack<T> {

    void push(T elem);

    T pop();

    T top();

    int size();

    boolean isEmpty();

}
