void main(String[] args) {
    //Q1.

   /* float [] marks = {45.8f, 67.3f, 99.2f, 100.0f};
    float sum = 0;
    for (float element : marks) {
        sum = sum + element;
    }
        System.out.println("Sum is: " + sum); */


    //Q2.
    /*
    float [] marks = {45.8f, 67.3f, 99.2f, 100.0f};
    float num = 45.8f;
    boolean isInArray = false;
    for (float element:marks) {
        if (num == element) {
            isInArray = true;
            System.out.println("Number searching : " +element);
            break;
        }
    }if (isInArray) {
        System.out.println("The value is present in the array");
    }
    else {
        System.out.println("The value is NOT present in the array.");
    }

     */

    //Q3.
    int [] marks = {40,50,30,20,40};
    int sum = 0;
    int avg = 0;

    for (int element:marks){
        sum = sum + element;
        avg = sum/marks.length;
    }
    System.out.println("The average marks of students in Physics is :" + avg);

















}