package com.sample.components

/**
  * Created by sinchan on 22/07/18.
  */
object ComponentTest {

  def main(args: Array[String]): Unit = {
    val comp:Component = new Square //a superclass objref can refer to a subclass object but vice versa is possible
    comp.area

    val comp1 = new Rectangle1(new Point(1,2),new Point(10,12))
    comp1.area
  }

}
