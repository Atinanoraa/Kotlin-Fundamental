fun main(){
    val wordOne = "Modern"
    val wordTwo = "Concise"
    val wordTree = "Pragmatic"
    val wordFour = "Safe"
    val x = """
        Kotlin is $wordOne
        Kotlin is $wordTwo
        Kotlin is $wordTree
        Kotlin is $wordFour
    """.trimIndent()
    println(x)
}