package com.sample.basictraits

/**
  * Created by sinchan on 01/04/18.
  */
//class Animal
//trait HasLegs
//class Frog extends Animal with Philosophical with HasLegs{

class Frog extends Philosophical {
  override def toString = "green"

 override def philosophize() {
    println("It ain't easy being "+ toString +"!")
 }
}

