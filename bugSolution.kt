fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 3 }
    println(list) // Output: [1, 2, 3]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.entries.removeIf { it.value > 1 }
    println(map) // Output: {a=1}

    // Safe way to remove elements from a list during iteration
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (item in list2) {
        if (item > 3) {
            toRemove.add(item)
        }
    }
    list2.removeAll(toRemove)
    println(list2) // Output: [1, 2, 3]
    
    //Another safe way to remove using an iterator
    val list3 = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list3.iterator()
    while (iterator.hasNext()){
        val item = iterator.next()
        if (item > 3){
            iterator.remove()
        }
    }
    println(list3) // Output: [1, 2, 3]
}