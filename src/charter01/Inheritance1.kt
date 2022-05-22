open class A1 {
    open val a = "Hello"
    val b = a.length
}

class B1 : A1() {
    override val a = "World"
}
