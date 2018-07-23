package com.sample.stackabletraits

/**
  * Created by sinchan on 02/04/18.
  */
trait Incrementing extends IntQueue {
  abstract override def put(x: Int) { super.put(x + 1) }
}

