/*
 * Program to implement Partial function to add three numbers in which one number is constant and two
   numbers can be passed as inputs and define another method which can take the partial
   function as input and squares the result.
 */

  package assignment

  object PartialFunction {
  def main(args: Array[String]): Unit = {

    /*
   *  A partially applied function is an expression in which you don’t
   *  supply all of the arguments needed by the function. Instead, you supply some, or none,
   *  of the needed arguments
   */

    val partFunc = sum(3, _: Int, _: Int)
    //Printing the result using partial function
    println("Sum is "+ partFunc(4, 5))
  
    // Passing partial function as argument  
    val sq = square(partFunc, 5, 5)
    //Printing square as result
    println("Square of result: " + sq)
  }

  /*
   * function to add three numbers
   */

   def sum(a: Int, b: Int, c: Int) = a + b + c

  /*
   * Method which can take the partial function as input and squares the result.
   */

  def square(f: (Int, Int) => Int, op1: Int, op2: Int): Int = f(op1, op2) * f(op1, op2)
  

}