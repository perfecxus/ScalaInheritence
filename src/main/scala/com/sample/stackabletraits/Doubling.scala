package com.sample.stackabletraits

/**
  * Created by sinchan on 02/04/18.
  */
trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}
