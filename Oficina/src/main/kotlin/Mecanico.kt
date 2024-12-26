data class Mecanico(
    var matricula: Int,
    var nome: String,
    var especialidades: MutableList<String>
) {

    fun funcionarioPremium(): Boolean {
        return especialidades.size > 1
    }
}
