import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class VeiculoTest {

    @Test
    fun `testa calculaGarantia para diferentes tipos de veículos`() {
        val veiculo = Veiculo(
            placa = "XYZ-9876",
            tipo = "SUV",
            numOcorrencias = 0,
            anoFabricacao = 2021
        )

        val garantiaEsperada = 2023 // 2021 + 2
        assertEquals(garantiaEsperada, veiculo.calculaGarantia(), "A garantia deve ser de 2 anos para todos os veículos.")
    }
}
