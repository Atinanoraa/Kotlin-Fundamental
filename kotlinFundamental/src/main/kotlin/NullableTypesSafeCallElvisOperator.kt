fun main() {
    var word : String? = null
    word = (word?.length?:"SMK TELKOM ") as String?
    val wordLength = word?.length
    print("Jumlah kata string dari $word sebanyak $wordLength")
}