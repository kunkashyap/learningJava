import  java.util.Scanner;

void main() {
    //Q1.
    int a = 10;
    if (a == 11) { // == checks equality
        System.out.println("I am 11");
    } else {
        System.out.println("I am not 11");
    }


    //Q2.
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter marks of subject 1:");
    int marks1 = sc.nextInt();

    System.out.print("Enter marks of subject 2:");
    int marks2 = sc.nextInt();

    System.out.print("Enter marks of subject 3:");
    int marks3 = sc.nextInt();

    int totalMarks = (marks1 + marks2 + marks3) / 3;
    System.out.println("Overall percentage is:" + totalMarks);


    if (totalMarks >= 40 && marks1 >= 33 && marks2 >= 33 && marks3 >= 33) {
        System.out.println("You have been promoted.");
    } else {
        System.out.println("You have NOT been promoted.");
    }


    //Q3.



















}


