

void main() {
    // Arrays

    /*
    Classroom of 500 students - You have to store marks of these 500 students
    You have 2 options:
        1. Create variables 500 times
        2. Use Arrays to store them in one block

     */

    //MEMORY ALLOCATION OF THE ARRAY
    int [] marks = new int[5];
    marks[0] = 100;
    marks[1] = 50;
    marks[2] = 30;
    marks[3] = 70;
    marks[4] = 90;
    marks[4] = 97;
    //marks[5] = 65; -> Throws an Error bcs we have defined array till 4th index [ 5-1] th
    System.out.println(marks[4]);






}