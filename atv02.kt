fun main() {
    val lista = listOf("Rua A, 10", null, "Av. B, 200")
    verificarEntregas(lista)
}

fun verificarEntregas(enderecos: List<String?>) {
    for (item in enderecos) {
        val endereco = item ?: "Endereço Desconhecido"

        if (endereco == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $endereco")
        }
    }
}