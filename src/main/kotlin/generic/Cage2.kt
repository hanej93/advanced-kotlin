package generic

fun main() {
  val cage: Cage2<out Fish> = Cage2<GoldFish>()

  // Any? 가 아닌 Any로 붙임으로써 Not-Null 타입으로 한정시킬  수 있다.
//  Cage2<GoldFish?>()
}

class Cage2<T : Any> {
  private val animals: MutableList<T> = mutableListOf()

  fun getFirst(): T {
    return animals.first()
  }

  fun put(animal: T) {
    this.animals.add(animal)
  }

  fun moveFrom(otherCage: Cage2<out T>) {
    this.animals.addAll(otherCage.animals)
  }

  fun moveTo(otherCage: Cage2<in T>) {
    otherCage.animals.addAll(this.animals)
  }
}