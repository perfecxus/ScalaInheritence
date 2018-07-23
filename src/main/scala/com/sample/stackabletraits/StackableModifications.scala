package com.sample.stackabletraits

/**
  * Created by sinchan on 02/04/18.
  */
object StackableModifications {

  def main(args: Array[String]): Unit = {
   /* val queue = new BasicIntQueue with Incrementing with Doubling
    queue.put(10)
    println(queue.get()) //linearization ---> lineage
*/
    //11 20 22 21
   val queue1 = new BasicIntQueue with Incrementing with Filtering
    queue1.put(-1)
    queue1.put(0)
    queue1.put(1)

    println(queue1.get())
    println(queue1.get())
    //println(queue1.get())
  }
}
