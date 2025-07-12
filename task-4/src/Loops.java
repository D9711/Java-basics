public class Loops {

    public void multiplesOfSeven() {

        int result = 0;
        int n = 1;
        
        while(result <= 100) {

            System.out.println(result);
            result = 7*n;
            n++;
            
        }
    }

    public int sumUpTo(int max) {

        int n = 0;
        int sumUpto = 0;

        while(n <= max) {  
            sumUpto += n;
            n++;
        }
        
        System.out.println(sumUpto);
       
        return sumUpto;

    }

    public int sumBetween(int min, int max) {

        int sumBetween = 0;

        for(int i = min; i <= max; i++) {
            
            if(min == max) {

                System.out.println(min);
                return min;

            }
            else if(min > max) {

                System.out.println(0);
                return 0;

            }
            else {

                sumBetween += i;

            }
            
        }
        
        System.out.println(sumBetween);
        return sumBetween;

    }

    public int sumSquares(int max) {

       int n = 0;
       int sumSquares = 0;

        while(n < max) {
            n++;  
            sumSquares += Math.pow(n, 2);
            
        }

        System.out.println(sumSquares);
        return sumSquares;

    }

    public double sumReciprocals(int max) {

        double sumReciprocals = 0;
        double n = 1;

        while(n <= max){
            
            sumReciprocals += n/2;
            n++;

        }

        System.out.print(sumReciprocals);
        return sumReciprocals;

    }

    public static void main(String[] args) {

        Loops loops = new Loops();

        loops.multiplesOfSeven();
        loops.sumUpTo(3);
        loops.sumBetween(12, 10);
        loops.sumSquares(3);
        loops.sumReciprocals(3);
        
    }

}