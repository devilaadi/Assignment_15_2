package acadgild

object pattern_matching {
  
  def main(args: Array[String]): Unit = {
    
    
    println("***********Acadgild Courses**********")
    println()
    println("1:Android")
    println("2:Big Data Development")
    println("3:Spark")
    println()
    
    println("Enter The Option for which You want to see the Price")
    
    val ip = scala.io.StdIn.readInt()
    
       ip match {
      
      case 1 =>  println("Android-12999")
      case 2 =>  println("Big Data Development-17999")
      case 3 =>  println("Spark-19999")
      case _ =>  println("You have Entered Wrong Value")
      
    }
    
    
  }
  
}