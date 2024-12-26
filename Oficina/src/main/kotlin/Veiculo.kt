data class Veiculo(
    val placa: String,
    val tipo: String,
    var numOcorrencias: Int,
    val anoFabricacao: Int
) {
    fun calculaGarantia(): Int {
        return anoFabricacao + 2 // Garantia de 2 anos para todos os tipos
    }
}
