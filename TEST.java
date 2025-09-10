import java.util.Scanner;

class ADD {
  public static void main(String[] args) {

    // Request Input
    Scanner num1 = new Scanner(System.in);
    System.out.println("Enter first number");

    int Firstnum = num1.nextInt();
    System.out.println("First Number is : " + Firstnum);


    Scanner num2 = new Scanner(System.in); 
    System.out.println("Enter second number");

    int Secondnum = num2.nextInt();
    System.out.println("Second number is : " + Secondnum);


    int x = Firstnum;
    int y = Secondnum;

    // add two numbers
    int sum = x + y;
    System.out.println(x + "+" + y + "=" + sum);

    num1.close();
    num2.close();
  }
}