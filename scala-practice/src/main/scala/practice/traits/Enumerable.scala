package practice.traits

import scala.collection.mutable

trait Enumerable[A] {
  def foreach[B](fun: A => B): Unit

  final def map[B](f: A => B): List[B] = {
    var members = mutable.Buffer.empty[B]
    foreach {m =>
      members += f(m)
    }
    members.toList
  }

  final def filter(p: A => Boolean): List[A] = {
    val members = mutable.Buffer.empty[A]
    foreach {m =>
      if (p(m)) members += m
    }
    members.toList
  }

  final def toList: List[A] = {
    val members = mutable.Buffer.empty[A]
    foreach {m =>
      members += m
    }
    members.toList
  }
}
