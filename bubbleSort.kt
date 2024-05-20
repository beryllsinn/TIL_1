fun bubbleSort(array: MutableList<Int>): List<Int> {
    val n = array.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                val bb = array[j]
                array[j] = array[j + 1]
                array[j + 1] = bb
            }
        }
    }
    return array
}
println("bubbleSort(listOf(5, 87, 4, 32, 90, 54).toMutableList())")
