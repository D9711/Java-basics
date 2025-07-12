public class Arithmetic {

    public int sum(int a, int b) {
       
       int sum = a + b;
       
        return sum;
        
    }

    public int difference(int a, int b){

        int difference = a - b;


        return difference;
    }

    public double average(double a, double b){

        double average = (a+b)/2;

        return average;
    }


    public static void main(String[] args) {
        // Create a new Arithmetic object
        Arithmetic arithmetic = new Arithmetic();
    
        // store the sum of 3 and 5 in a variable called "test"
        int test = arithmetic.sum(3, 5);
    
        // print the test variable
        System.out.println("The value of 3 + 5 is:");
        System.out.println(test);

        int test2 = arithmetic.difference(2, 5);

        System.out.println("The value of 2 - 5 is:");
        System.out.println(test2);

        double test3 = arithmetic.average(3.0, 4.0);
     

        System.out.println("The average value of 3 and 4");
        System.out.println(test3);


    }
}