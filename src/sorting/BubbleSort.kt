package sorting

fun bubbleSort(array: IntArray): IntArray {
    var isSorted = true

    while (isSorted) {

        isSorted = false

        for (index in 0 until array.size - 1) {

            if (array[index] > array[index + 1]) {

                //swapping the elements if !false
                val temp = array[index]
                array[index] = array[index + 1]
                array[index + 1] = temp

                isSorted = true
            }
        }
    }
    return array
}

fun main() {

    val sortedArray = bubbleSort(intArrayOf(2, 15, 4, 23, 6, 87, 9, 3))
    //printing out the sorted array
    sortedArray.forEach { print("$it ") }
}