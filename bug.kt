fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 3 }
    println(list) // Output: [1, 2, 3]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.entries.removeIf { it.value > 1 }
    println(map) // Output: {a=1}

    // This will result in ConcurrentModificationException
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    for (item in list2) {
        if (item > 3) {
            list2.remove(item)
        }
    }
    println(list2) //Throws ConcurrentModificationException
}