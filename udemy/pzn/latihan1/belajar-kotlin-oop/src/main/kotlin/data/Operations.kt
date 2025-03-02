package data

sealed class Operations(val name: String)
class Plus : Operations("Plus")
class Minus : Operations("Minus")
class Modulo : Operations("Modulo")