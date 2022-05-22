class Parent {
    val tag = "Hello"
}

class Child(parent: Parent) {
    val tag = parent.tag
}