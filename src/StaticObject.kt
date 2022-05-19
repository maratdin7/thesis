class C {
    val b = O.c

    fun hello(): String = "Hello, World!"
}

object O {
    val c = C()
    val hello = c.b.hello()
}