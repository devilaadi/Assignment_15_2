package acadgild

object par_applied_func {

//Addition Logic  
  def add(x:Int,y:Int,z:Int) = {
    var res = x+y+z
    res    
  }
  
//Square Logic  
  def sqr(x:Int, f:Int => Int) = {
     f(x)
  }
  
  def sqrFunc(y:Int)= {
    y*y
  }
  
  def main(args: Array[String]): Unit = {
    
    val addWithOne= add(_:Int,_:Int,1)

//Enter Two Number and adding 1 to the result
    
println("***********ENTER TWO NUMBERS******************")    
println()
    println("Please enter First Number")
    val fNo = scala.io.StdIn.readInt()
    
    println("Please enter Second Number")
    val secNo = scala.io.StdIn.readInt()
    
    println("Adding One to the Result: "+ addWithOne(fNo,secNo))

    
 println()    
 
 println("*****************Square a number passing Function as input in function************************")   
    
   println("Square of Number : Please enter the Number")

   val num = scala.io.StdIn.readInt()
   
   println(s"Square of $num:"+sqr(num,sqrFunc))
    
  }
  
}