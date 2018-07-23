package com.sample.basictraits

/**
  * Created by sinchan on 01/04/18.
  */
object FrogTest {

  def main(args: Array[String]): Unit = {
    val frog = new Frog
    frog.philosophize()

    val phil:Philosophical = new Frog
    phil.philosophize()
  }

}
