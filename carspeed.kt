class Car(
    val model: String,
    var speed: Int,
    var gas: Int
) {
    fun getSpeeds(): Int = speed

    fun increaseSpeed() {
        speed += 10
    }

    fun addGas(newGas: Int) {
        gas += newGas
    }

    fun decreaseSpeed() {
        speed -= 10
    }

    fun takeGas(amount: Int) {
        if (gas >= amount) {
            gas -= amount
        } else {
            println("Not enough gas to take.")
        }
    }
}

val myCar = Car("KIA", 0, 0)
println(myCar.getSpeeds())
myCar.addGas(100)
for (i in 1..10) {
    myCar.increaseSpeed()
    println(myCar.getSpeeds())
}

val myCar2 = Car("HYUNDAI", 100, 100)
println(myCar2.getSpeeds())
myCar2.takeGas(50)
for (i in 1..10) {
    myCar2.decreaseSpeed()
    println(myCar2.getSpeeds())
}
