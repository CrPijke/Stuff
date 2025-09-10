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

    float Firstnum = num1.nextFloat();
    System.out.println("First Number is : " + formatResult(Firstnum));

    //Request Second number

    Scanner num2 = new Scanner(System.in); 
    System.out.println("Enter second number");

    float Secondnum = num2.nextFloat();
    System.out.println("Second number is : " + formatResult(Secondnum));


    float x = Firstnum;
    float y = Secondnum;

    if (answer1.equals("add")) {
        float sum = addThings(x,y);
        System.out.println(formatResult(x) + "+" + formatResult(y) + "=" + formatResult(sum));
    } else if (answer1.equals("subtract")) {
        float subtract = subtractThings(x,y);
        System.out.println(formatResult(x) + "-" + formatResult(y) + "=" + formatResult(subtract));
    } else if (answer1.equals("multiply")) {
      float multiply = multiplyThings(x, y);
      System.out.println(formatResult(x) + "*" + formatResult(y) + "=" + formatResult(multiply));
    } else if (answer1.equals("divide")) {
      float divide = divideThings(x, y);
      System.out.println(formatResult(x) + "/" + formatResult(y) + "=" + formatResult(divide));
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

  public static String formatResult(float result) {
    return (result == (int) result)
            ? String.format("%d", (int) result)
            : String.valueOf(result);
}
}