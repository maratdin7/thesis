open class A {
    val a = "Hello"
    val b = getName().length

    open fun getName() = a
}

class B : A() {
    val c = "World"

    override fun getName() = c
}
