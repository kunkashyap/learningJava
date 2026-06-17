
import java.util.Scanner;



void main() {
   //do-while loop
    /* do-while me pehle do{} execute hoga and then wo check
    karega while() condition

    meaning- Executes the code first & then checks the condition
     */
    Scanner sc = new Scanner(System.in);

    System.out.println("Print upto N numbers : ");
    int N = sc.nextInt();
    int i = 1;
   do {
       System.out.println(i);
       i++;
   }while(i <= N);

}