import java.util.ArrayList;

public class SetTheory {
    
    public static ArrayList<Integer> generateSet(int min, int max) {

        ArrayList<Integer> integerList = new ArrayList<>();
        
        if (max > 100) {

            max = 100;

        } else if (min < 0) {

            min = 0;
        }
        
        for(int i = min; i < max; i++) {

            integerList.add(i);

        }

        return integerList;

    }

    public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> listUnion = new ArrayList<>();

        for(int element: a) {

            listUnion.add(element);

        }

        for(int element2: b) {

            if(listUnion.contains(element2)) {

             }else {

                listUnion.add(element2);
            }

        }
        
        System.out.println(listUnion);
        return listUnion;
    
    }

    public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        
        ArrayList<Integer> listIntersection = new ArrayList<>();

        for(int element3: a) {

            if(b.contains(element3)) {
            listIntersection.add(element3);

        }
    }

        System.out.println(listIntersection);
        return listIntersection;

    }

    public static ArrayList<Integer> complement(ArrayList<Integer> a) {

        ArrayList<Integer> listComplement = new ArrayList<>();

        for(int i = 0; i < 100; i++) {

            if(a.contains(i)) {

            }else {

                listComplement.add(i);
            }
        }

        System.out.println(listComplement);
        return listComplement;

    }

    public static int cardinality(ArrayList<Integer> a) {
        
        int cardinality = 0;

        for(int i = 0; i < a.size(); i++) {

            cardinality++;
        }

        return cardinality;

    }

    public static int cardinalityOfUnion(ArrayList<Integer> a, ArrayList<Integer> b) {

        int cardinalityOfUnion = 0;

        for (int i = 0; i < a.size(); i++) {

            cardinalityOfUnion++;
        }

        for (int i = 0; i < b.size(); i++) {

            cardinalityOfUnion++;
        }

        for (int element4: a) {

            if(b.contains(element4)) {

                cardinalityOfUnion--;
            }
        }

        return cardinalityOfUnion;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> exampleSet = generateSet(5, 10);
        ArrayList<Integer> listA = generateSet(0, 5);
        ArrayList<Integer> listB = generateSet(0, 16);
        
        union(listA, listB);
        intersection(listA, listB);
        complement(listA);

        int cardinality = cardinality(listA);
        int cardinalityOfUnion = cardinalityOfUnion(listA, listB);

        System.out.println(cardinalityOfUnion);
        System.out.println(cardinality);
        System.out.println(exampleSet);
        System.out.println(listA);
        System.out.println(listB);
       
    }
    
}
