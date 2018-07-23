package com.sample.basictraits

import com.sample.components.Point

/**
  * Created by sinchan on 01/04/18.
  */
/*
class Rectangle(val topLeft: Point, val bottomRight: Point) {
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left

  def area = left * right
  // and many more geometric methods...
}
*/

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular {
  override def width = right - left
  def area = left * right
  // and many more geometric methods...
}
