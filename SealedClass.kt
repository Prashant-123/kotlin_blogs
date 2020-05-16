sealed class Color{
    class Red : Color()
    class Orange : Color()
    class Blue : Color()
}
fun getColor(c: Color) =
        when (c) {
            is Color.Red -> println("Paint in Red Color")
            is Color.Orange -> println("Paint in Orange Color")
            is Color.Blue -> println("Paint in Blue Color")
        }

fun main() {
    val r = Color.Red()
    getColor(r)
}