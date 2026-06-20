public class Methods {
    /* Sometimes our program grows in size, and we want to
        separate the logic of main method to other methods
        for instance- If we are calculating average of a number pair
        5 times-we can use methods to avoid repeating the logic
        Runs on DRY Principle - Don't Repeat Yourself */

    //Method
    static int logic(int x, int y){
        int z;
        if (x>y){
            z= x+y;
        }else {
            z= (10*x)+y;
        } return z;
    }

    static void main() {
        int a = 2;
        int b = 7;
        int c;
        c=logic(a,b);
        System.out.println(c);


        int a1 = 90;
        int b1 = 5;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c1);
    }
}
