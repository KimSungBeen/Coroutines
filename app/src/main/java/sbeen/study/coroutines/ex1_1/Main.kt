package sbeen.study.coroutines.ex1_1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    t4()
}

fun t1() = runBlocking {
    println(this)
    println(Thread.currentThread().name)
    println("Hello")
}

fun t2() = runBlocking {
    println(coroutineContext)
    println(Thread.currentThread().name)
    println("Hello")
}

fun t3() = runBlocking {
    launch {
        println("launch: ${Thread.currentThread().name}")
        println("World")
    }
    println("runBlocking: ${Thread.currentThread().name}")
    println("Hello")
}

fun t4() = runBlocking {
    launch {
        println("launch: ${Thread.currentThread().name}")
        println("World")
    }
    println("runBlocking: ${Thread.currentThread().name}")
    delay(500L) //launch가 먼저 실행되도록 양보를함
    println("Hello")
}