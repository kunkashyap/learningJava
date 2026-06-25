public class PracticeOnMethods {
    static void multiplication(int n){
        for (int i = 1; i <=10 ; i++) {
            System.out.format("%d X %d = %d \n",n,i,n*i);
        }
    }


    static void pattern1(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static int sumRect(int n){
        //sum(3) = 3 + sum(2)
        // sum(3) = 3 + 2 + sum(1)
        // sum(3) = 3 + 2 + 1 (base condition)
        if (n==1){  //Base Condition -> Recursion
            return 1;
        }else {
            return n + sumRect(n-1);
        }
    }

    static void pattern2(int n){
        for (int i = n; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }



    static void main(String[] args) {
//        //Problem-1
//        multiplication(6);
//
//        //Problem-2
//        pattern1(5);
//
//        //Problem-3 (Important - Recursion)
//        int c;
//        c =sumRect(3);
//        System.out.println(c);


            pattern2(4);
    }
}
