import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MecanicoTest {

    @Test
    fun `testa funcionarioPremium com mais de uma especialidade`() {
        val mecanico = Mecanico(
            matricula = 101,
            nome = "Carlos",
            especialidades = mutableListOf("Motor", "Freios")
        )

        assertTrue(mecanico.funcionarioPremium(), "Funcionário com mais de uma especialidade deve ser premium.")
    }

    @Test
    fun `testa funcionarioPremium com apenas uma especialidade`() {
        val mecanico = Mecanico(
            matricula = 102,
            nome = "Ana",
            especialidades = mutableListOf("Motor")
        )

        assertFalse(mecanico.funcionarioPremium(), "Funcionário com uma especialidade não deve ser premium.")
    }
}
