

void main() {
    //Break and Continue Statements using for Loops

//    for (int i = 0; i < 15; i++) {
//        System.out.println("java is great " + i);
//        if (i == 8) {
//            System.out.println("Ending Loop");
//            break;
//        }
//    }


    //Break using While Loop
//    int i = 0;
//    while (i < 5){
//        System.out.println("Java is great " + i);
//        i++;
//        if (i == 3){
//            System.out.println("Ending Loop");
//            break;
//        }
//    }


    // Break using do while loop
//    int x = 0;
//    do {
//        System.out.println("Java is great " + x);
//
//        if (x == 5){
//            System.out.println("Ending Loop");
//            break;
//        }x++;
//
//    }while (x < 5);
//    System.out.println("Loop ends here");


    // CONTINUE STATEMENTS

//    for (int i = 0; i < 10 ; i++) {
//        if (i == 2){
//            System.out.println("Ending Loop");
//            continue;  /*Skips the i == 2 (will print ending loop when i ==2)
//                        and jump next to i == 3
//
//                         */
//        }
//        System.out.println("Java is great " + i);
//
//
//    }

    // Continue in Do while loops
    int i = 0;
    do {
        i++;
        if (i == 2) {
            System.out.println("Ending the loop");
            continue;
        }
        System.out.println("Java is great " + i);

    } while (i < 5);
    System.out.println("Loop ends here");

}












