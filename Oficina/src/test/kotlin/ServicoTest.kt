import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ServicoTest {

    @Test
    fun `teste do metodo ordemServico`() {
        // Instanciando o mecânico
        val mecanico = Mecanico(
            matricula = 101,
            nome = "Carlos",
            especialidades = mutableListOf("Motor", "Freios")
        )

        // Instanciando o veículo
        val veiculo = Veiculo(
            placa = "XYZ-9876",
            tipo = "SUV",
            numOcorrencias = 0,
            anoFabricacao = 2021
        )

        // Criando o serviço
        val servico = Servico(
            id = 1,
            motivo = null,
            mecanico = mecanico,
            veiculo = veiculo
        )

        // Verificar estado inicial
        assertNull(servico.motivo, "O motivo do serviço deve começar como null.")
        assertEquals(0, veiculo.numOcorrencias, "O número inicial de ocorrências deve ser 0.")

        // Realizando a ordem de serviço
        servico.ordemServico("Troca de óleo e revisão completa")

        // Verificar resultados
        assertEquals("Troca de óleo e revisão completa", servico.motivo, "O motivo deve ser atualizado corretamente.")
        assertEquals(1, veiculo.numOcorrencias, "O número de ocorrências do veículo deve ser incrementado.")
    }
}
