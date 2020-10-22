
class QuickStart {
  public static void main(String[] args) { //The main() method is required and you will see it in every Java program:
      // System.out.println("Hello, World.");

      /// Data Type
      int myNum =5;  //interger
      float myFloatNum = 5.999f;  // Floating point Number
      char myLetter = 'V'; // Character
      boolean myBool =true; //Boolean
      String myText ="hello World";  //String
     /* Data types are divided into two groups:
      => Primitive data types - includes byte, short, int, long, float, double, boolean and char
      => Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
    */

    // Widening Casting
    // double MyDouble = myNum;
    // System.out.println(myNum);
    // System.out.println(MyDouble);
    //Narrowing Casting
    double myDouble = 9.67;

    int myInt = (int) myDouble;
    System.out.println(myDouble);
    System.out.println(myInt);


  }
}