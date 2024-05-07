    val n = 15
    var tmp = 1
    for (i in 1..n step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
        tmp++
    }
