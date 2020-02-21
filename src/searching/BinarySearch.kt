package searching

fun binarySearch(array: Array<Int>, element: Int, low: Int, high: Int): Int {

    while (low <= high) {
        //computing the middle of the array
        val mid = (low + high) / 2
        when {
            element > array[mid] -> return binarySearch(array, element, mid + 1, high)
            element < array[mid] -> return binarySearch(array, element, low, mid - 1)
            element == array[mid] -> return mid
        }
    }
    return -1
}

fun main() {

    val array = arrayOf(2, 3, 8, 9, 13, 45, 67, 99, 999)
    val element = 9

    val position = binarySearch(array, element, 0, array.size - 1)
    if (position >= 0) println("Element $element is at the position $position in the array")
    else println("Element $element is not in the array")

    val element2 = 49
    val position2 = binarySearch(array, element2, 0, array.size - 1)
    if (position2 >= 0) println("Element $element2 is at the position $position2 in the array")
    else println("Element $element2 is not in the array")
}
