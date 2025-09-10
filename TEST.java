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

    float Firstnum = num1.nextInt();
    System.out.println("First Number is : " + Firstnum);

    //Request Second number

    Scanner num2 = new Scanner(System.in); 
    System.out.println("Enter second number");

    float Secondnum = num2.nextInt();
    System.out.println("Second number is : " + Secondnum);


    float x = Firstnum;
    float y = Secondnum;

    if (answer1.equals("add")) {
        float sum = addThings(x,y);
        System.out.println(x + "+" + y + "=" + sum);
    } else if (answer1.equals("subtract")) {
        float subtract = subtractThings(x,y);
        System.out.println(x + "-" + y + "=" + subtract);
    } else if (answer1.equals("multiply")) {
      float multiply = multiplyThings(x, y);
      System.out.println(x + "*" + y + "=" + multiply);
    } else if (answer1.equals("divide")) {
      float divide = divideThings(x, y);
      System.out.println(x + "/" + y + "=" + divide);
    }
    

    num1.close();
    num2.close();
    operation.close();


  }
  private static float addThings(float num1, float num2) {
    return num1 + num2;
  }

  private static float subtractThings(float num1, float num2) {
    return num1 - num2;
  }

  private static float multiplyThings(float num1, float num2) {
    return num1 * num2;
  }

  private static float divideThings(float num1, float num2) {
    return num1 / num2;
  }
}