package sorting

fun selectionSort(array: IntArray): IntArray {
    var min: Int
    for (i in 0 until array.size - 1) {
        min = i
        for (j in i + 1 until array.size - 1) {
            if (array[j] < array[min]) {
                min = j
            }
        }

        //swapping the elements
        val temp = array[min]
        array[min] = array[i]
        array[i] = temp
    }

    return array
}

fun main() {

    //calling the sort method and storing into an immutable variable sortedArray
    val sortedArray = selectionSort(intArrayOf(23, 45, 99, 1, 2, 6, 43, 88))
    //printing the sorted array
    sortedArray.forEach { print("$it ") }
}