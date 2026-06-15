import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Marks for Subject 1:");
    float a = sc.nextFloat();
    System.out.println("Enter Marks for Subject 2:");
    float b = sc.nextFloat();
    System.out.println("Enter Marks for Subject 3:");
    float c = sc.nextFloat();
    System.out.println("Enter Marks for Subject 4:");
    float d = sc.nextFloat();
    System.out.println("Enter Marks for Subject 5:");
    float e = sc.nextFloat();

    float totalMarks = a+b+c+d+e;
    System.out.println("Total Marks of the subjects are:");
    System.out.println(totalMarks);

    float percentage = (totalMarks/500)*100;
    System.out.println("Percentage of the student is :");
    System.out.println(percentage);




}