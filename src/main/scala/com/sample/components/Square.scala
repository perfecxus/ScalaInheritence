package com.sample.components

import Point

/**
  * Created by sinchan on 27/05/18.
  */
class Square extends Component{

  override def topLeft: Point = new Point(10,25)

  override def bottomRight: Point = new Point(11,34)

  override def area: Unit = println(length*length)
}
