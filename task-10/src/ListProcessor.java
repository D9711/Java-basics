import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * The class ListProcessor function is to process different kind of lists with
 * algoritms.
 * For example shuffling the order of a given list (can be generated with the
 * firs two methods),
 * and to summarize the values of the List in two different ways, iterative and
 * recursive.
 * 
 * @author Daniel Parmhed
 */

public class ListProcessor {

    /**
     * The method arraySequence generates an Array with the parameters int from and
     * int to where it will,
     * add the numbers between the two numbers to the array in order of the size of
     * numbers. The parameters from,
     * have to be less then the parameter to. If the same number is applied the
     * Array will be empty.
     * 
     * @param from the given integer the Array will start from
     * @param to   the given integer that sets the upper boundry of the Array,
     *             non-inclusive
     * @throws IllegalArgumentException if parameter from is greater then to
     * @return an Array of integers
     */

    public int[] arraySequence(int from, int to) {

        int index = to - from;
        int[] arraySequence;

        if (from > to) {

            throw new IllegalArgumentException();

        } else if (from == to) {

            arraySequence = new int[0];

            return arraySequence;

        } else {

            arraySequence = new int[index];

            for (int i = 0; i < index; i++) {

                arraySequence[i] = from + i;
                System.out.println(arraySequence[i]);

            }

            return arraySequence;

        }
    }

    /**
     * The method listSequence generates an ArrayList with the parameters int from
     * and
     * int to where it will,
     * add the numbers between the two numbers to the list in order of the size of
     * numbers. The parameters from,
     * have to be less then the parameter to. If the same number is applied the
     * Array will be empty.
     * 
     * @param from the given integer the ArrayList will start from
     * @param to   the given integer that sets the upper boundry of the ArrayList,
     *             non-inclusive
     * @throws IllegalArgumentException if parameter from is greater then to
     * @return an ArrayList of integers
     */

    public List<Integer> listSequence(int from, int to) {

        List<Integer> listSequence = new ArrayList<Integer>();

        if (from == to) {

            return listSequence;

        } else if (from > to) {

            throw new IllegalArgumentException("parameter int from must be < then int to");
        } else {
            for (int i = from; i < to; i++) {

                listSequence.add(i);
            }
            return listSequence;
        }
    }

    /**
     * The method shuffled takes an Int Array, clone it and then swaps the order of
     * the
     * elements in the clone randomly. The method iterates over the clone and
     * creates the randomised
     * index. The swap operation where two elements changes place is done by a
     * separate method
     * that is called with the parameters: the clone array, the foor loop counter i
     * and the randomised index
     * of the array. The randomised index and swap method is build so that for each
     * loop
     * the index before can never be called again. For example the secound loop
     * is i = 1 wich means the randomised index will be 1+(the lenght of that array
     * minus 1)
     * and can't be 0 again.
     * 
     * @param numbers the int array given as parameter
     * @return a new Array with the order of elements swaped randomly
     */

    public int[] shuffled(int[] numbers) {

        Random random = new Random();

        int[] shuffledArray = numbers.clone();

        for (int i = 0; i < shuffledArray.length; i++) {

            int randomIndex = i + random.nextInt(shuffledArray.length - i);

            swap(shuffledArray, i, randomIndex);
        }

        return shuffledArray;

    }

    /**
     * The swap method is given 3 parameters from the shuffled method. The cloned
     * array,
     * int a wich is the for loop counter and a randomised integer within the range
     * of the arrays index
     * Then it saves the element with the index a, takes an random element in the
     * list
     * and give it the index a. Then the saved element gets placed in the random
     * elements index.
     * This way two elements swaps place in the index.
     * 
     * @param array       the clone array from shuffled
     * @param a           the for loop counter
     * @param randomIndex the randomised index from shuffled method
     */

    private void swap(int[] array, int a, int randomIndex) {

        int saved = array[a];
        array[a] = array[randomIndex];
        array[randomIndex] = saved;

    }

    /**
     * The shuffled method with an integer List as parameter works the same way
     * as the shuffled method with an integer Array as parameter. With the change
     * that
     * the arrayList methods for copying is different and instead of lenght, size is
     * used.
     * 
     * @param numbers the parameter the method is given when called. (An arrayList)
     * @return the copied arrayList with the index order swaped.
     */

    public List<Integer> shuffled(List<Integer> numbers) {

        Random random = new Random();

        List<Integer> copyOfNumbers = new ArrayList<>();
        copyOfNumbers.addAll(numbers);

        int index = copyOfNumbers.size();

        for (int i = 0; i < index; i++) {

            int randomIndex = i + random.nextInt(index - i);
            swap(copyOfNumbers, i, randomIndex);

        }

        return copyOfNumbers;

    }

    /**
     * The swap for an integer List works the same as the swap with an int Array
     * with
     * the change that Arraylist uses set and get.
     * 
     * @param arraylist   the copy ArrayList
     * @param a           the for loop counter from Shuffled method
     * @param randomIndex the randomised index from Shuffled method
     */

    private void swap(List<Integer> arraylist, int a, int randomIndex) {

        int saved = arraylist.get(a);
        arraylist.set(a, arraylist.get(randomIndex));
        arraylist.set(randomIndex, saved);
    }

    /**
     * The method sumIterative iterates over a given array and adds up the elements
     * of
     * that array to the field sumIterative then returns the value.
     * 
     * @param numbers the given parameter an array
     * @return returns the summed value of the array
     */

    public int sumIterative(int[] numbers) {

        int sumIterative = 0;

        for (int element : numbers) {

            sumIterative += element;
        }

        return sumIterative;

    }

    /**
     * Same as above with the change that it takes an arrayList.
     * 
     * @param numbers the given parameter ArrayList
     * @return the sum of the value of each element in the ArrayList
     */

    public int sumIterative(List<Integer> numbers) {

        int sumIterative = 0;

        for (int element : numbers) {

            sumIterative += element;
        }

        return sumIterative;
    }

    /**
     * The method sums the value of an array recursive by calling itself with the
     * array method
     * copy of Range where it will go over all the elements in the array each call.
     * 
     * @param numbers the given parameter that is an array
     * @return the sum of the value of each element in the Array
     */

    public int sumRecursive(int[] numbers) {

        if (numbers.length == 0) {

            return 0;

        } else {

            return numbers[0] + sumRecursive(Arrays.copyOfRange(numbers, 1, numbers.length));

        }

    }

    /**
     * The method sums the value of an arrayList recursive by calling itself with
     * the arrayList method
     * subList where it will go over all the elements in the List each call.
     * 
     * @param numbers the given parameter that is an arrayList
     * @return the sum of the value of each element in the ArrayList
     */

    public int sumRecursive(List<Integer> numbers) {

        if (numbers.size() == 0) {

            return 0;
        } else {

            return numbers.get(0) + sumRecursive(numbers.subList(1, numbers.size()));
        }
    }

   
}
