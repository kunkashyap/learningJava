import java.util.Scanner;

void main() {
     //else-if clause

     Scanner sc = new Scanner(System.in);
     int age;
     System.out.print("Enter your age :");
     age = sc.nextInt();
     if (age>56){
          System.out.println("You are experienced");
     } else if (age >46) {
          System.out.println("You are semi experienced");
     }
     else{
          System.out.println("You are not experienced.");
     }
}