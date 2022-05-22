open class A4 {
    val a = "Hello"
    val b = foo().length

    open fun foo() = a
}

class B4 : A4() {
    override fun foo() = "World"
}