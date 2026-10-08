fun main() {
    val calcularGorjeta: (Double?) -> Double = {
        if (it == null || it < 0) {
            0.0
        } else {
            it
        }
    }

    println(calcularGorjeta(null))
    println(calcularGorjeta(-3.0))
    println(calcularGorjeta(8.5))
}