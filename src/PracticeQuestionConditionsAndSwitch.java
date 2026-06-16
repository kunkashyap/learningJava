import  java.util.Scanner;

void main() {
//    //Q1.
//    int a = 10;
//    if (a == 11) { // == checks equality
//        System.out.println("I am 11");
//    } else {
//        System.out.println("I am not 11");
//    }


//    //Q2.
//    Scanner sc = new Scanner(System.in);
//
//    System.out.print("Enter marks of subject 1:");
//    int marks1 = sc.nextInt();
//
//    System.out.print("Enter marks of subject 2:");
//    int marks2 = sc.nextInt();
//
//    System.out.print("Enter marks of subject 3:");
//    int marks3 = sc.nextInt();
//
//    int totalMarks = (marks1 + marks2 + marks3) / 3;
//    System.out.println("Overall percentage is:" + totalMarks);
//
//
//    if (totalMarks >= 40 && marks1 >= 33 && marks2 >= 33 && marks3 >= 33) {
//        System.out.println("You have been promoted.");
//    } else {
//        System.out.println("You have NOT been promoted.");
//    }


//    //Q3.
//    Scanner st = new Scanner(System.in);
//    System.out.print("Enter your income in Lakhs :");
//
//    float tax =  0;
//    float income = st.nextFloat();
//
//    if(income<=2.5){
//        tax = tax + 0;
//    }
//    else if(income > 2.5f && income <= 5f){
//        tax = tax + 0.05f * (income - 2.5f);
//    }
//    else if(income > 5f && income < 10f){
//        tax = tax + 0.05f * ( 5.0f - 2.5f);
//        tax = tax + 0.05f * (income - 5f);
//    }
//    else if (income > 10.0f) {
//        tax = tax + 0.05f * (5.0f - 2.5f);
//        tax = tax + 0.2f * (10.0f - 5f);
//        tax = tax + 0.3f * (income - 10.0f);
//    }
//    System.out.println("The total tax paid by employee is: " + tax + " Lakhs");

    // Q4.

//    Scanner sd = new Scanner(System.in);
//    System.out.print("Enter the day in number(1,2,3...) :");
//    int day = sd.nextInt();
//    switch (day) {
//        case 1 -> System.out.println("Monday");
//        case 2 -> System.out.println("Tuesday");
//        case 3 -> System.out.println("Wednesday");
//        case 4 -> System.out.println("Thursday");
//        case 5 -> System.out.println("Friday");
//        case 6 -> System.out.println("Saturday");
//        case 7 -> System.out.println("Sunday");
//
//    }


    // Q5.
    Scanner sy = new Scanner(System.in);
    System.out.println("Enter the year: ");
    int year = sy.nextInt();

    if(year%4==0){
        System.out.println(year + " is a leap year.");
    }

    else{
        System.out.println(year + " is NOT a leap year.");
    }













}


