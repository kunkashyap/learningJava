void main() {

/*
    float[] marks = {100.5f,70.4f,30.5f,20.4f,10.0f};
    System.out.println(marks[2]);

    String [] students = {"A","B","C","D"};
    System.out.println(students[3]); */



    //Displaying Array (for loop)
    int[] marks = {70,60,40,30,100};
//    for (int i = 0; i < marks.length ; i++) {
//        System.out.println(marks[i]);
//    }


    //Displaying the Reverse
//    for (int i = marks.length -1; i >= 0 ; i--) {
//        System.out.println(marks[i]); }




    //For each loop
    for (int element : marks){
        System.out.println(element);
    }


}