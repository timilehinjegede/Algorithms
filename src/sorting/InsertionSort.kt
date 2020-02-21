package sorting

fun insertionSort(array: IntArray): IntArray {
    var i: Int

    //for loop that goes through the array
    for (j in 1 until array.size) {
        val key = array[j]
        i = j - 1

        while (i >= 0 && array[i] > key) {
            array[i + 1] = array[i]
            i--
        }
        array[i + 1] = key
    }
    return array
}

fun main() {

    //calling the sort method and storing into an immutable variable sortedArray
    val sortedArray = insertionSort(intArrayOf(23, 22, 46, 1, 2, 9, 66))
    //printing the sorted array
    sortedArray.forEach { print(it) }
}