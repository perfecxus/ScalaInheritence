package com.sample.components

//import Point

/**
  * Created by sinchan on 27/05/18.
  */
class Rectangle1(topLeftPoint:Point,bottomRigthPoint:Point) extends Component{ //superclass and subclass

  override def topLeft = topLeftPoint

  override def area = println(length * width)

  override def bottomRight: Point = bottomRigthPoint
}
