open class A3 {
    open val a = "Hello"
    val b = foo()

    fun foo() = a.length
}

class B3 : A3() {
    override val a = "World"
}
