void main() {
    // PRECEDENCE & ASSOCIATIVITY
    int a = 6*5-34/2;
    /*
        30 - 34/2
        30 - 17
        13

     */
    int b = 60/5-34*2;
    /*
        * and / are equal precedence
        so Associativity comes in use
        that means we eval LEFT -> RIGHT

        12 - 34 *2
        12 - 68
        -56

     */
    System.out.println(a);
    System.out.println(b);

    //Quick Quiz
    int x =5;
    int y =4;
    int c =9;
    int k = (x * y)/2;

    int l = (b*b - (4*a*c))/(2*a*c);
    System.out.println(k);
    System.out.println(l);


    //b






}
