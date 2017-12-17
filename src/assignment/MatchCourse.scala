/*
 * Program to print the prices of 4 courses of Acadgild: Android-12999,Big Data
   Development-17999,Big Data Development-17999,Spark-19999 using match and add a
   default condition if the user enters any other course.
 * 
 * 
 */
 

package assignment

object MatchCourse {
  
  def main(args: Array[String]): Unit = {
    price("Android")
    price("Big Data Development")
    price("Spark")
    price("Java")
    
  }
  /*A pattern match includes a sequence of alternatives, each starting with the
  keyword case. Each alternative includes a pattern and one or more expressions
  to evaluate if the pattern matches. An arrow symbol => separates the
  pattern from the expressions.
  A match expression is evaluated by trying each of the patterns in the
  order they are written. The first pattern that matches is selected, and the part
  following the arrow is selected and executed
   * 
   * 
   */
  
  def price(course:String) = {
val secondArg = course match {
case "Big Data Development" => println("Price is : Rs 17999")
case "Android" => println("Price is : Rs 12999")
case "Spark" => println("Price is : Rs 19999")
case _ => println("Course Not Available Yet!!")
}
}

  
}




