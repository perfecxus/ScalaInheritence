package com.sample.components
//a space where name is unique


/**
  * Created by sinchan on 01/04/18.
  */
abstract class Component {
  def topLeft: Point
  def bottomRight: Point
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  def length = topLeft.y - bottomRight.y


  def area
  // and many more geometric methods...
}
/*

abstract class Component extends Rectangular {
  // and many more geometric methods...
}*/
