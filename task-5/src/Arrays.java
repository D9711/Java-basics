public class Arrays {

    public static int average(int[] intArray) {

        int average;
        int sum = 0;

        for(int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        average = sum/2;

        System.out.println(average);
        return average;

    }

    public static double average(double[] doubleArray) {

        double average;
        int sum = 0;

        for(int i = 0; i < doubleArray.length; i++) {

            sum += doubleArray[i];
        }

        average = sum/2;
        
        System.out.println(average);

        return average;
    }

    public static int smallestElement(int[] intArray) {
        int smallestElement = intArray[0];

        for(int i = 0; i < intArray.length; i++) {
            
            if(intArray[i] < smallestElement) {

                smallestElement = intArray[i];
            }

        }

        System.out.println(smallestElement);
        return smallestElement;
    }

    public static int[] reverse(int[] intArray) {

        int[] reversed;
        reversed = new int[intArray.length];
        int i = intArray.length;

        for(int element: intArray) {

            i--;
            reversed[i] = element;
            
           System.out.println(reversed[i]);
           System.out.println(intArray[i]);
           
        }

        return reversed;
  
    }

    public static int[] evenNumbers(int[] intArray) {
        
        int totalAmountOfEvenNumbers = 0;
        int i = 0;

        for(int element: intArray) {

            if(element % 2 == 0) {

                totalAmountOfEvenNumbers++;
            }
        }

        int[] evenNumbers;
        evenNumbers = new int[totalAmountOfEvenNumbers];

            for(int element2: intArray) {

                if(element2 % 2 == 0) {

                    evenNumbers[i] = element2;
                    System.out.println(evenNumbers[i]);
                    i++;
                    
                }
            }
        
        return evenNumbers;
    }

    public static void main(String[] args) {

        int[] intArray;
        intArray = new int[5];

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        double[] doubleArray;
        doubleArray = new double[3];

        doubleArray[0] = 4;
        doubleArray[1] = 2;
        doubleArray[2] = 3;
        average(doubleArray);
        average(intArray);
        smallestElement(intArray);
        reverse(intArray);
        evenNumbers(intArray);
        
    }

}