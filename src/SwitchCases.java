import java.util.Scanner;

void main() {
     //else-if clause

     Scanner sc = new Scanner(System.in);
     int age;
     System.out.print("Enter your age :");
     age = sc.nextInt();
//     if (age>56){
//          System.out.println("You are experienced");
//     } else if (age >46) {
//          System.out.println("You are semi experienced");
//     }
//     else{
//          System.out.println("You are not experienced.");
//     }
     //Switch Case
     switch (age){
          case 18:
               System.out.println("You are legally an adult.");
               break;

          case 23:
               System.out.println("You are going to join a Job");
               break;

          case 60:
               System.out.println("You are gonna retired.");
               break;

          default:
               System.out.println("Enjoy the moment");

     }

}