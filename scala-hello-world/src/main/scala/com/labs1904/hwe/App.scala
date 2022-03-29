package com.labs1904.hwe

object App {
  def main(args: Array[String]): Unit = {
    println("Hello World")
  }

  def greeting(name: String): String = {
    "Hello " + name
  }

  /*
  Practice from docs.scala-lang.org/tour/basics.html
   */

  val x = 1 + 1
  println(x)

  var y = 1 + 1
  y = 3
  println(y * y)

  var z: Int = 2 + 2

  println({
    val a = 3 + 3
    a + 4
  })

  (b: Int) => b + 1

  val addOne = (x: Int) => x + 1
  println(addOne(11))

  val add = (x: Int, y: Int) => x + y
  println(add(7,8))

  val getTheAnswer = () => 17
  println(getTheAnswer())

  def addIt(x: Int, y: Int): Int = x + y
  println(addIt(9,10))

  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
  println(addThenMultiply(3,4)(3))

  def name: String = System.getProperty("user.name")
  println("Hello, " + name + "!")

  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }
  println(getSquareString(2.5))

  class Greeter(prefix: String, suffix: String) {
    def greet(name: String): Unit =
      println(prefix + name + suffix)
  }

  val greeter = new Greeter("Hello, ", "!")
  greeter.greet("Scala developer")

  case class Point(x: Int, y: Int)
  val point = Point(1,2)
  val anotherPoint = Point(1,2)
  val yetAnotherPoint = Point(2,2)

  if (point == anotherPoint) {
    println(s"$point and $anotherPoint are the same.")
  } else {
    println(s"$point and $anotherPoint are different.")
  }

  if (point == yetAnotherPoint) {
    println(s"$point and $yetAnotherPoint are the same.")
  } else {
    println(s"$point and $yetAnotherPoint are different.")
  }

  object IdFactory {
    private var counter = 0
    def create(): Int = {
      counter += 1
      counter
    }
  }

  val newId: Int = IdFactory.create()
  println(newId)
  val newerId: Int = IdFactory.create()
  println(newerId)

  trait Greeter2 {
    def greet(name: String): Unit =
      println("Hello, " + name + "!")
  }

  class DefaultGreeter extends Greeter2

  class CustomizableGreeter(prefix: String, postfix: String) extends Greeter2 {
    override def greet(name: String): Unit = {
      println(prefix + name + postfix)
    }
  }

  val greeter2 = new DefaultGreeter()
  greeter2.greet("Scala developer")

  val customGreeter = new CustomizableGreeter("How are you, ", "?")
  customGreeter.greet("Scala developer")

  object Main {
    def main(args: Array[String]): Unit =
      println("Hello, Scala developer!")
  }

}