import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

/**
 * A class for reversing List and array types.
 *
 * @author Daniel Parmhed
 * @version 2022-12-07
 */
public class Reverse {

    /**
     * Return a reversed copy of the argument array.
     * The passed array is NOT mutated.
     *
     * @param array An array.
     * @return A reversed copy of array.
     */
    public int[] reversed(int[] array) {

        int[] reversed;
        reversed = new int[array.length];
        int j = 0;
        int countBasicOperations = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            reversed[j] = array[i];
            j++;
            countBasicOperations += 1;

        }

        return reversed;

    }

    /**
     * Return a reversed copy of the argument List.
     * The passed List is NOT mutated.
     *
     * @param list A List.
     * @return A reversed copy of list.
     */
    public List<Integer> reversed(List<Integer> list) {

        ArrayList<Integer> listReversed = new ArrayList<>();
        int countBasicOperations = 0;

        for (int i = list.size() - 1; i >= 0; i--) {

            listReversed.add(list.get(i));
            countBasicOperations += 1;

        }

        return listReversed;

    }

}
