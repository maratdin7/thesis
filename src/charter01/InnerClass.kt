class Outer {
    val i = Inner()
    val tag = "Hello"

    inner class Inner {
        val tagLength = tag.length
    }
}