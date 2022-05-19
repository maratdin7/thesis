class Message {
    fun foo(): String = name

    val hello: String = "Hello, " + foo()
    val name: String = "Alice"
}