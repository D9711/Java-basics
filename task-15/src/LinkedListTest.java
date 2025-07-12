public class LinkedListTest extends StackTest {

    @Override
    public void setUp() {

        super.setUp();
    }

    @Override
    protected Stack<Integer> getIntegerStack() {

        LinkedList<Integer> newStack = new LinkedList<Integer>();

        
        return newStack;
    }
    
}
