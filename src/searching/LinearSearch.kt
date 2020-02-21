package searching

fun linearSearch(list: List<Any>, element: Any): Int? {
    for ((position, value) in list.withIndex()) {
        if (value == element) return position
    }
    return -1
}

fun main() {

    //initializing a list of integers and strings
    val myList = listOf(4, 8, "Java", "Dart", "Kotlin", "Swift", 7)
    println(myList)

    //finding the position of a string in the list
    val element = "Kotlin"
    val position = linearSearch(myList, element)

    //if element is not in the list
    if (position == -1) println("Element $element cannot be found")
    //if element is found in the list
    else println("$element is in the position $position in the List")

    //finding the position of an integer in the list
    val element2 = 7
    val position2 = linearSearch(myList, element2)

    //if element is not in the list
    if (position2 == -1) println("Element $element2 cannot be found")
    //if the element is found in the list
    else println("$element2 is in the position $position2 in the List")
}