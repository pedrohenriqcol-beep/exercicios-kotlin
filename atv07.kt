fun main() {
    val emails = listOf("ana@email.com", null, "", "joao@email.com")
    limparEmails(emails)
}

fun limparEmails(emails: List<String?>) {
    var invalidas = 0

    for (email in emails) {
        val tamanho = email?.length ?: 0

        if (tamanho == 0) {
            invalidas = invalidas + 1
            println("Conta inválida: será deletada")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Contas para apagar: $invalidas")
}