package extra

import java.lang.IllegalArgumentException
import kotlin.system.measureTimeMillis

class Lec24 {
}

fun main() {
//    TODO("main 함수 구현")
    repeat(3) {
        println("Hello World")
    }

    val start = System.currentTimeMillis()
    val a = 1
    val b = 2
    val result = a + b
    println("소요시간 : ${System.currentTimeMillis() - start}ms")

    var timeMillis = measureTimeMillis {
        val a = 1
        val b = 2
        val result = a + b
    }

    val result2: Result<Int> = runCatching { 1 / 0 }
    println(result2)
}

fun acceptOnlyTwo(num: Int) {
    require(num == 2) { "2만 허용!" }
//    if (num != 2) {
//        throw IllegalArgumentException("2만 허용!")
//    }
}

class Person {
    val status: PersonStatus = PersonStatus.PLAYING

    fun sleep() {
        check(this.status == PersonStatus.PLAYING) { "에러 메시지!" }
//        if (this.status != PersonStatus.PLAYING) {
//            throw IllegalStateException()
//        }
    }

    enum class PersonStatus {
        PLAYING, SLEEPING
    }
}