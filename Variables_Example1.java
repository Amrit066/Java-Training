class Variables_Example1{
  public static void main(String[] args){

    // Declaring variables
    byte number1, number2, number3;
    int sum_res, mul, sub, avg;

    // Initializing variables
    number1 = 12; number2 = 13; number3 = 11;
    sum_res = number1+number2+number3;
    mul = number1*number2*number3;
    sub = number1-number2-number3;
    avg = (number1+number2+number3)/3;

    System.out.println("Sum of "+number1+", "+number2+" and "+number3+" is "+sum_res);
    System.out.println("Subtraction of "+number1+", "+number2+" and "+number3+" is "+sub);
    System.out.println("Multiplication of "+number1+", "+number2+" and "+number3+" is "+mul);
    System.out.println("Average of "+number1+", "+number2+" and "+number3+" is "+avg);

  }
}
