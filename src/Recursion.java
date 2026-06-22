public class Recursion {

    static int  factorial(int n){
        // factorial(0) = 1
        // factorial(n) = n* n-1 * n-2
        // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
        // LOGIC : factorial(n) = n* factorial(n-1)

        if (n==0 || n==1){
            return 1;
        }else {
            return n * factorial(n-1);
        }

    }

    static void main() {

        int n = 6;
        System.out.println("The value of Factorial " + n + ": "+ factorial(n));

    }

}
