package org.example.generic


fun main() {
}

class Cage4<in T> {
  private val animals: MutableList<T> = mutableListOf()

  fun put(animal: T) {
    this.animals.add(animal)
  }

  fun putAll(animals: List<T>) {
    this.animals.addAll(animals)
  }
}