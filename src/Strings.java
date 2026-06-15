import java.util.Scanner;


void main(String[] args) {
    //String name = new String("Kunal");
    String name = "Kunal";
    System.out.print("The name is : ");
    System.out.println(name);


    int a = 6;
    float b = 5.6f;

    System.out.printf("The value of a is %d and value of b is %f", a,b );
    System.out.format("The value of a is %d and value of b is %f", a,b );

    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    System.out.println(st);

}