data class Servico(
    val id: Int,
    var motivo: String?,
    val mecanico: Mecanico,
    val veiculo: Veiculo
) {
    init {
        // Inicialização adicional, se necessário, pode ser feita aqui
        motivo = null
    }

    // Método para registrar a ordem de serviço
    fun ordemServico(motivo: String) {
        this.motivo = motivo
        veiculo.numOcorrencias++
    }

    override fun toString(): String {
        return "Serviço(ID: $id, Motivo: ${motivo ?: "Não especificado"}, Mecânico: ${mecanico.nome}, Veículo: ${veiculo.placa})"
    }
}
