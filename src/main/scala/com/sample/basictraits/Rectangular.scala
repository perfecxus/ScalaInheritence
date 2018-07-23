package com.sample.basictraits

import com.sample.components.Point

/**
  * Created by sinchan on 01/04/18.
  */
trait Rectangular {
  def topLeft: Point
  def bottomRight: Point
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  def area
  // and many more geometric methods...
}
