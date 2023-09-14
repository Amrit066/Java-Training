class Variables_Example{
  public static void main(String[] args){

    // Declaring variables
    byte number1, number2;
    boolean result;

    // (i) Checking if two numbers are equal or not

    // Initializing Variables
    number1 = 12;
    number2 = 13;
    result = number1 == number2?true:false;

    if(result)
      System.out.println(number1+" and "+number2+" are equal.");
    else
      System.out.println(number1+" and "+number2+" are not equal.");



      // (ii) Checking if two numbers are equal or not

      // Initializing Variables
      number1 = 100;
      number2 = 100;
      result = number1 == number2?true:false;

      if(result)
        System.out.println(number1+" and "+number2+" are equal.");
      else
        System.out.println(number1+" and "+number2+" are not equal.");
  }
}
