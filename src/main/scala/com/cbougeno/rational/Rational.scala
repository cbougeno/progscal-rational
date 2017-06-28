package com.cbougeno.rational

/**
  * Created by cbougeno on 27/6/17.
  */
class Rational (n: Int, d: Int ) {
  require(d != 0)
  val numer:Int = n
  val denom:Int = d

  def this(n: Int) = this(n, 1)

  override def toString: String = n + "/" + d

  def add(that: Rational):Rational =
    new Rational(
      this.numer * that.denom + this.denom * that.numer,
      this.denom * that.denom
    )
}