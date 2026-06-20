public class MethodsOverloading {


    static void change(int a){
        a = 97;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }



    //Method Overloading -> Changing with Parameters only

    static void foo(){
        System.out.println("GOOD MORNING");
    }

    static void foo(String a , String b) {
        System.out.println("GOOD MORNING " + a);
        System.out.println("Good evening "+ b);
    }






    static void tellJoke(){
        /*void Return type
          When We don't want our method to return anything, we use void
          as return type */
        System.out.println(" I invented new word Plagiarism");

    }
    static void main() {
//        tellJoke();


        /* "static" keyword is used to associate a methode of a
        given class with the class rather than the object
        Static Method in the class is shared by all the objects
         */


        //CASE 1: Changing the Integer
//        int [] marks = {52,71,53,77,98,67,94};
//        int x = 46;
//        change(x);
//
//        System.out.println("The value of running X after change is" + x);


        //CASE 2: Changing the Array
        int [] marks = {52,71,53,77,98,67,94};
        change2(marks);
        System.out.println("The value of x after changing : " + marks[0]);

        //Refence is passing here


        //METHOD OVERLOADING
        /* Two or More methods can have same name but different
        parameters
         */

        foo();
        foo("Kunal", "Tunal");//Arguments are Actual and Parameters are sample given in Methods









    }
}
