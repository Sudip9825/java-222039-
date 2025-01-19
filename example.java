public class example {
     public static void main(String[] args) {
        System.out.println("hello world");
        System.out.print("it is used to print in same line");
        System.out.print(5);
        System.out.println();
        System.out.println(5*5);//comment
        /*
         * variables types in java are
         * String
         * char
         * int here "final" keywowd is used so that value cannot be overritten
         * float 
         * boolean
         */
        int rollnumber=5;
        String name="ram";
        System.out.println(name);
        System.out.println("name of student is " + name);
        System.out.println("student rollnumber is:" + rollnumber);

        // example for boolean data type
        boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false
//String functions 
System.out.println("length of string is :" + name.length());
System.out.println("string into upper case:" + name.toUpperCase());
// + is used for string concatination// + adds number and concatinate string
 // java maths functions
 int randomNum = (int) (Math.random() * 10);  // 0 to 100
 System.out.println("a random number  between 0 to 10 is :" + randomNum);
 System.out.println(Math.min(5, 10));// similarly math.min math.sqrt etc are used

 // short hand if else (similar to if else condition)
 //syntax for short hand if else is :
 //variable = (condition) ? expressionTrue :  expressionFalse;
  int marks= 40;
  String result= ( marks < 40 ) ?"fail.":"pass";
  System.out.println(result);

  // program to check wheather the number is odd or even
  int num = 5;
  if (num % 2 ==0) {
      System.out.println( num +"num is even number");
  }
  else{
    System.out.println(num+ " " + "is odd number");
  }

  /*switch case in java
   */
     }
}
