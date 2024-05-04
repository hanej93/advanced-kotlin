package generic

fun main() {
  val cage = Cage()
  cage.put(Carp("잉어"))
  // 해당 코드는 매우 위험하다.
//  val carp: Carp = cage.getFirst() as Carp

  // 단순 타입 캐스트보단 안전하지만 에러가 나올 수 있음
//  val carp: Carp = cage.getFirst() as? Carp
//    ?: throw IllegalArgumentException()


  val goldFishCage = Cage2<GoldFish>()
  goldFishCage.put(GoldFish("금붕어"))

  val fishCage = Cage2<Fish>()
  // fishCage.moveFrom(goldFishCage) // Type mismatch
}

class Cage {
  private val animals: MutableList<Animal> = mutableListOf()

  fun getFirst(): Animal {
    return animals.first()
  }

  fun put(animal: Animal) {
    this.animals.add(animal)
  }

  fun moveFrom(cage: Cage) {
    this.animals.addAll(cage.animals)
  }
}
