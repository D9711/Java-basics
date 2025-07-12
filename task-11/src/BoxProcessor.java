import java.util.List;

/**
 * This class sorts and searches Arrays and Lists containing box objects in
 * different ways.
 * 
 * @author Daniel Parmhed
 */

public class BoxProcessor {

    /**
     * This method sorts a given array of boxes by the volume of the boxes.
     * In order from small to biggest.
     * 
     * @param array
     */

    public void sort(Box[] array) {

        for (int i = 1; i < array.length; i++) {

            int j = i;

            while (j > 0 && array[j - 1].compareTo(array[j]) == 1) {

                Box temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j = j - 1;

            }

        }
    }

    /**
     * This method sorts a given list of boxes by the volume of the boxes.
     * In order from small to biggest.
     * 
     * @param list
     */

    public void sort(List<Box> list) {

        for (int i = 1; i < list.size(); i++) {

            int j = i;

            while (j > 0 && list.get(j - 1).compareTo(list.get(j)) == 1) {

                Box temp = list.get(j);
                list.set(j, list.get(j - 1));
                list.set(j - 1, temp);
                j = j - 1;

            }
        }

    }

    /**
     * This method searches for a box of the same volume in the array and returns
     * the index
     * of that box. The method is straight forward, it starts with the index 0 and
     * goes up through the whole array if no box is found.
     * 
     * @param array
     * @param box
     * @return the index of the box or if no box is found -1
     */

    public int sequentialSearch(Box[] array, Box box) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].compareTo(box) == 0) {

                return i;
            }
        }

        return -1;

    }

    /**
     * This is the same as above but it goes through a list instead of an array
     * 
     * @param list
     * @param box
     * @return the index of the box or if no box is found -1
     */

    public int sequentialSearch(List<Box> list, Box box) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).compareTo(box) == 0) {

                return i;
            }
        }

        return -1;
    }

    /**
     * This method also searches for a box with the same volume but it starts
     * at the middle index of the array. The index the search uses is the sum of the
     * lowest
     * in the array and the biggest index. Then divided by 2.
     * 
     * If no box is found during the first iteration it will either make the lowest
     * or the highest
     * index bigger/smaller depending on the compareto result.
     * And then sum and divide by 2 again. This way the number of searches is
     * limited.
     * 
     * @param array
     * @param box
     * @return the index of the box or if no box is found -1
     */

    public int binarySearch(Box[] array, Box box) {

        int indexLowest = 0;
        int indexHighest = array.length - 1;

        while (indexLowest <= indexHighest) {

            int index = (indexLowest + indexHighest) / 2;

            if (array[index].compareTo(box) == 0) {

                return index;

            } else if (array[index].compareTo(box) == 1) {

                indexHighest = index - 1;

            } else if (array[index].compareTo(box) == -1) {

                indexLowest = index + 1;
            }

        }

        return -1;

    }

    /**
     * Same as above but with an list instead of an array
     * 
     * @param list
     * @param box
     * @return the index of the box or if no box is found -1
     */

    public int binarySearch(List<Box> list, Box box) {

        int indexLowest = 0;
        int indexHighest = list.size() - 1;

        while (indexLowest <= indexHighest) {

            int index = (indexLowest + indexHighest) / 2;

            if (list.get(index).compareTo(box) == 0) {

                return index;

            } else if (list.get(index).compareTo(box) == 1) {

                indexHighest = index - 1;

            } else if (list.get(index).compareTo(box) == -1) {

                indexLowest = index + 1;
            }

        }

        return -1;

    }

}
