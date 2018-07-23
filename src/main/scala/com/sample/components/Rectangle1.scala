package com.sample.components

import Point

/**
  * Created by sinchan on 27/05/18.
  */
class Rectangle1(topLeftPoint:Point,bottomRigthPoint:Point) extends Component{

  override def topLeft = topLeftPoint

  override def area = length * width

  override def bottomRight: Point = bottomRigthPoint
}
