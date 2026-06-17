void main() {
    //for Loop
//    for (<initialize>; <boolean-expression>; <update|increment/decrement>) {
//         <Piece-of-code>
//         }

        // 2n = Even Numbers = 0,2,4,6,8
        // 2n+1 = Odd Numbers = 1,3,5,7,9

    // ODD
    System.out.println("Odd Numbers:");
    int n = 5;
    for (int i = 0; i < n; i++) {
        System.out.println(2*i+1);

    }

    //EVEN
    System.out.println( "\n");
    System.out.println("Even Numbers:");
    int x = 10;
    for (int i = 0; i <x ; i++) {
        System.out.println(2 * i);
    }





    // Descending Order
    System.out.println("\n");
        System.out.println("Numbers in Descending Order:");

        for (int j = 5; j > 0 ; j--) {
            System.out.println(j);


        }
    }
