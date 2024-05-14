package com.example.mbti

import android.media.CamcorderProfile


open class Mbti {
    open fun song() {
        println(" Into the UnKnown ")
    }
}

class Analysts : Mbti() {
    override fun song() {
        println(" Panic! At The Disco ")
    }
}

open class Champ(var name: String)
class Diplomats(name: String) : Champ(name) {
    fun function(a: Char) {
        println("나는 수학이다")
    }
}

val champ = Diplomats("요네")
