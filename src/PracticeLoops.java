void main() {
    //Q1.
//    int n = 4;
//    for (int i = n; i > 0 ; i--) {
//        for (int j = 0; j < i; j++) {
//            System.out.print("*");
//        }
//        System.out.println("\n");
//    }
    // Q2.
//    int sum = 0 ;
//    int n = 3;
//    for (int i = 0; i <= n ; i++) {
//        sum = sum + (2*i);
//    }
//    System.out.print("The sum of even numbers is : ");
//    System.out.println(sum);

    //Q3. Multiplication Table
//    int n = 5;
//    for (int i = 1; i <= 10; i++) {
//        System.out.printf("%d x %d = %d \n", n , i, n*i);
//
//    }


    //Q4. Reverse Multiplication
//    int n = 10;
//    for (int i = 10; i >= 1; i--) {
//        System.out.printf("%d x %d = %d \n", n , i, n*i);
//
//    }


    //Q6. FACTORIAL USING WHILE LOOP
    // FACTORIAL n = n* n-1 * n-2 ...
//    int n = 5;
//    int i = 1;
//    int factorial = 1;
//    while (i<n){
//            factorial *= i;
//            i++;
//    }
//    System.out.println("Factorial is : " + factorial);


    // Q9.
    int n = 8;
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
        System.out.printf("%d x %d = %d \n", n , i, n*i);
        sum += n*i;
        System.out.println("Sum of table 8 is:" + sum);

    }








}