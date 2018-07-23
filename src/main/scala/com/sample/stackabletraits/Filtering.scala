package com.sample.stackabletraits

/**
  * Created by sinchan on 02/04/18.
  */
trait Filtering extends IntQueue {
  abstract override def put(x: Int) {
    if (x >= 0) super.put(x)
  } }
