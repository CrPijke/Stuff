import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {

    // Request Method
    Scanner operation = new Scanner(System.in);
    String answer1;
    System.out.println("Do you want to add, subtract, multiply or divide?");
    answer1 = operation.next();

    //Request First number

    Scanner num1 = new Scanner(System.in);
    System.out.println("Enter first number");

    int Firstnum = num1.nextInt();
    System.out.println("First Number is : " + Firstnum);

    //Request Second number

    Scanner num2 = new Scanner(System.in); 
    System.out.println("Enter second number");

    int Secondnum = num2.nextInt();
    System.out.println("Second number is : " + Secondnum);


    int x = Firstnum;
    int y = Secondnum;

    if (answer1.equals("add")) {
        int sum = addThings(x,y);
        System.out.println(x + "+" + y + "=" + sum);
    } else if (answer1.equals("subtract")) {
        int subtract = subtractThings(x,y);
        System.out.println(x + "-" + y + "=" + subtract);
    } else if (answer1.equals("multiply")) {
      int multiply = multiplyThings(x, y);
      System.out.println(x + "*" + y + "=" + multiply);
    } else if (answer1.equals("divide")) {
      int divide = divideThings(x, y);
      System.out.println(x + "/" + y + "=" + divide);
    }
    

    num1.close();
    num2.close();
    operation.close();


  }
  private static int addThings(int num1, int num2) {
    return num1 + num2;
  }

  private static int subtractThings(int num1, int num2) {
    return num1 - num2;
  }

  private static int multiplyThings(int num1, int num2) {
    return num1 * num2;
  }

  private static int divideThings(int num1, int num2) {
    return num1 / num2;
  }
}