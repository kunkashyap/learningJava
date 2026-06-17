import java.util.Scanner;
import java.util.Random;


void main() {
    //ROCK , PAPER AND SCISSORS Game
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    System.out.println("Choose Rock (1), paper(2), scissor(3):");
    int choice = sc.nextInt();
    int answer = rd.nextInt(2);
    switch (choice){
        case 1 -> System.out.println(answer);
        case 2 -> System.out.println(answer);
        case 3 -> System.out.println(answer);
    }
    if (choice == 1 && answer == 3){
        System.out.println("Rock v Scissor -> WIN");

    } else if (choice == 2 && answer == 1) {
        System.out.println(" Paper v Rock -> Win");

    } else if (choice == 3 && answer == 2) {
        System.out.println(" Scissor v Paper -> Win");
    } else {
        System.out.println("Better luck next time!");
    }


}