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
    /*
    int [] marks = {40,50,30,20,40};
    int sum = 0;
    int avg = 0;

    for (int element:marks){
        sum = sum + element;
        avg = sum/marks.length;
    }
    System.out.println("The average marks of students in Physics is :" + avg);
*/

    //Q4.
    int[][] mat1 = {{1, 2, 3},
                    {4, 5, 6}};

    int[][] mat2 = {{5, 6, 7},
                    {8, 9, 10}};

    int [] [] result = {{0,0,0},
                        {0,0,0}};


    for (int i = 0 ; i< mat1.length; i++){  //It will execute Row number of times
        for (int j = 0; j < mat1[i].length ; j++) { //It will execute Column number of times

            result [i][j] = mat1[i][j] + mat2[i][j];
            System.out.print(result [i] [j] + " ");
        }
        System.out.println("");

}











}