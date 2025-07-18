import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.fail;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Random;

/**
 * Test class for BoxProcessor.
 *
 * @author Simon Larsén
 * @author Anton Lyxell
 * @author Tobias Hansson
 * @version 2018-11-11
 */
public class BoxProcessorTest {

    /* An instance of the boxProcessor */
    private BoxProcessor boxProcessor;

    /* An instance of a helper class, used to construct boxes */
    private BoxFactory boxFactory;

    /* The length of the even length list used in the tests */
    private final int EVEN_LIST_LENGTH = 100;
    /* The length of the odd length list used in the tests */
    private final int ODD_LIST_LENGTH = 99;

    /* An array of even length */
    private Box[] evenArray;
    /* An array of odd length */
    private Box[] oddArray;

    /* A list of even length */
    private List<Box> evenList;
    /* A list of odd length */
    private List<Box> oddList;

    /**
     * Set up variables to be available for each test case.
     *
     * Assistant's note: this function is executed once before every test
     * case in this class. In this method we initalize some default
     * values that will use to verify the correctness of the list processor.
     */
    @Before
    public void setUp() {
        boxProcessor = new BoxProcessor();
        boxFactory = new BoxFactory();
        oddList = boxFactory.boxList(ODD_LIST_LENGTH);
        evenList = boxFactory.boxList(EVEN_LIST_LENGTH);
        oddArray = boxFactory.boxArray(ODD_LIST_LENGTH);
        evenArray = boxFactory.boxArray(EVEN_LIST_LENGTH);
    }

    /**
     * Assert that sorting an empty array has no effects.
     */
    @Test
    public void sortHasNoEffectWhenArrayIsEmpty() {
        // Arrange
        Box[] array = boxFactory.boxArray(0);
        // Act
        boxProcessor.sort(array);
        // Assert
        assertThat(array.length, equalTo(0));
    }

    /**
     * Assert that sorting an empty list has no effects.
     */
    @Test
    public void sortHasNoEffectWhenListIsEmpty() {
        // Arrange
        List<Box> list = boxFactory.boxList(0);
        // Act
        boxProcessor.sort(list);
        // Assert
        assertThat(list.size(), equalTo(0));
    }

    /**
     * Assert that sorting an array with a single element has no effects.
     */
    @Test
    public void sortHasNoEffectWhenArrayHasSingleElement() {
        // Arrange
        Box[] array = boxFactory.boxArray(1);
        Box[] arrayTest = array.clone();
        // Act
        boxProcessor.sort(array);
        // Assert
        assertThat(array, equalTo(arrayTest));
    }

    /**
     * Assert that sorting a list with a single element has no effects.
     */
    @Test
    public void sortHasNoEffectWhenListHasSingleElement() {
        // Arrange
        List<Box> list = boxFactory.boxList(1);
        List<Box> listCopy = list;
        // Act
        boxProcessor.sort(list);
        // Assert
        assertThat(list, equalTo(listCopy));
    }

    /**
     * Assert that sorting a multiple element array results in a correct
     * ordering of the elements.
     */
    @Test
    public void sortMultipleElementArrayGivesCorrectOrdering() {
        // Arrange
        Box[] actual = evenArray;
        Box[] expected = actual.clone();
        // Act
        Arrays.sort(expected);
        boxProcessor.sort(actual);
        // Assert
        assertThat(actual, equalTo(expected));
    }

    /**
     * Assert that sorting a multiple element list results in a correct
     * ordering of the elements.
     */
    @Test
    public void sortMultipleElementListGivesCorrectOrdering() {
        // Arrange
        List<Box> actual = evenList;
        List<Box> expected = new ArrayList<>(actual);
        // Act
        Collections.sort(expected);
        boxProcessor.sort(actual);
        // Assert
        assertThat(actual, equalTo(expected));
    }

    /**
     * Assert that sequentialSearch returns the correct index
     * for all elements in an array with multiple elements.
     */
    @Test
    public void sequentialSearchFindsAllElementsInArray() {
        // Arrange
        Box[] array = boxFactory.boxArray(5);
        Box[] arrayTest = new Box[array.length];

        // Act
        for (int i = 0; i < array.length; i++) {

            arrayTest[boxProcessor.sequentialSearch(array, array[i])] = array[i];

        }

        // Assert
        assertThat(array, equalTo(arrayTest));

    }

    /**
     * Assert that sequentialSearch returns the correct index
     * for all elements in a list with multiple elements.
     */
    @Test
    public void sequentialSearchFindsAllElementsInList() {
        // Arrange
        List<Box> list = boxFactory.boxList(5);
        List<Box> listTest = new ArrayList<>();

        // Act
        for (int i = 0; i < list.size(); i++) {

            listTest.add(boxProcessor.sequentialSearch(list, list.get(i)), list.get(i));

        }

        // Assert
        assertThat(list, equalTo(listTest));
    }

    /**
     * Assert that sequentialSearch returns negative one as
     * index when the element is not found in the array.
     */
    @Test
    public void sequentialSearchInArrayReturnsNegativeOneOnNotFound() {
        // Arrange
        Box[] array = boxFactory.boxArray(0);
        // Act, Assert
        assertThat(boxProcessor.sequentialSearch(array, new Box(0, 0, 0)),
                equalTo(-1));
    }

    /**
     * Assert that sequentialSearch returns negative one as
     * index when the element is not found in the list.
     */
    @Test
    public void sequentialSearchInListReturnsNegativeOneOnNotFound() {
        // Arrange
        List<Box> list = boxFactory.boxList(0);
        // Act, Assert
        assertThat(boxProcessor.sequentialSearch(list, new Box(0, 0, 0)),
                equalTo(-1));
    }

    /**
     * Assert that binarySearch returns the correct index
     * for all elements in an even length array with multiple elements.
     */
    @Test
    public void binarySearchFindsAllElementsInEvenArray() {
        // Arrange
        Arrays.sort(evenArray);
        for (int i = 0; i < evenArray.length; i++) {
            // Act, Assert
            assertThat(boxProcessor.binarySearch(evenArray, evenArray[i]),
                    equalTo(i));
        }
    }

    /**
     * Assert that binarySearch returns the correct index
     * for all elements in an even length list with multiple elements.
     */
    @Test
    public void binarySearchFindsAllElementsInEvenList() {
        // Arrange
        Collections.sort(evenList);
        for (int i = 0; i < evenList.size(); i++) {
            // Act, Assert
            assertThat(boxProcessor.binarySearch(evenList, evenList.get(i)),
                    equalTo(i));
        }
    }

    /**
     * Assert that binarySearch returns the correct index
     * for all elements in an odd length array with multiple elements.
     */
    @Test
    public void binarySearchFindsAllElementsInOddArray() {
        // Arrange
        Arrays.sort(oddArray);

        for (int i = 0; i < oddArray.length; i++) {
            // Act, Assert
            assertThat(boxProcessor.binarySearch(oddArray, oddArray[i]),
                    equalTo(i));
        }
    }

    /**
     * Assert that binarySearch returns the correct index
     * for all elements in an odd length list with multiple elements.
     */
    @Test
    public void binarySearchFindsAllElementsInOddList() {
        // Arrange
        Collections.sort(oddList);
        for (int i = 0; i < oddList.size(); i++) {
            // Act, Assert
            assertThat(boxProcessor.binarySearch(oddList, oddList.get(i)),
                    equalTo(i));
        }
    }

    /**
     * Assert that binarySearch returns negative one as
     * index when the element is not found in the array.
     */
    @Test
    public void binarySearchInArrayReturnsNegativeOneWhenNotFound() {
        // Arrange
        Box[] array = boxFactory.boxArray(0);
        // Act, Assert
        assertThat(boxProcessor.binarySearch(array, new Box(0, 0, 0)),
                equalTo(-1));
    }

    /**
     * Assert that binarySearch returns negative one as
     * index when the element is not found in the list.
     */
    @Test
    public void binarySearchInListReturnsNegativeOneWhenNotFound() {
        // Arrange
        List<Box> list = boxFactory.boxList(0);
        // Act, Assert
        assertThat(boxProcessor.binarySearch(list, new Box(0, 0, 0)),
                equalTo(-1));
    }
}

/**
 * A helper class to aid construction of collections of Box object.
 */
class BoxFactory {

    /*
     * The upper bound (exclusive) of the values submitted
     * to the box constructor
     */
    private static final int BOX_MAX_DIMENSION = 50;
    /* The random generator, seeded with to make test suit deterministic */
    private final Random random;

    /* Constructor for BoxFactory */
    public BoxFactory() {
        random = new Random(0);
    }

    /**
     * Returns a boolean indicating whether the input array contains
     * a duplicate of the element and a given index in the indices
     * before the given index.
     *
     * @param array an array of Box objects to search for duplicates in
     * @param index the index to search from
     * @return the boolean indicator value
     */
    private boolean prefixContains(Box[] array, int index) {
        for (int i = 0; i < index; i++) {
            if (array[i].compareTo(array[index]) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns an array of Box objects with random properties.
     * The array is guaranteed to not contain duplicates.
     *
     * @param size the number of elements in the array
     * @return the array of Box objects
     */
    public Box[] boxArray(int size) {
        Box[] array = new Box[size];
        for (int i = 0; i < size; i++) {
            do {
                array[i] = new Box(random.nextInt(BOX_MAX_DIMENSION),
                        random.nextInt(BOX_MAX_DIMENSION),
                        random.nextInt(BOX_MAX_DIMENSION));
            } while (prefixContains(array, i));
        }
        return array;
    }

    /**
     * Returns a list of Box objects with random properties.
     * The list is guaranteed to not contain duplicates.
     *
     * @param size the number of elements in the list
     * @return the list of Box objects
     */
    public List<Box> boxList(int size) {
        return Arrays.asList(boxArray(size));
    }

}
