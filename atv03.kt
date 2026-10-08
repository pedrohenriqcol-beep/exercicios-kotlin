fun main() {
    validarBioInfantil("Gosto de desenhar")
    validarBioInfantil(null)
    validarBioInfantil("Esta biografia é muito grande e passa de cinquenta caracteres com certeza")
}

fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}