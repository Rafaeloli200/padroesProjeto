package Builder;

import org.junit.Test;
import static org.junit.Assert.*;

public class ColaboradorBuilderTest {
    
   @Test
    void retornarColaboradorSemId() {
        try {
            ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
            Colaborador colaborador = colaboradorBuilder
                    .setNome("Colaborador1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Identificacao invalida", e.getMessage());
        }
    }

    @Test
    void retornarColaboradorSemNome() {
        try {
            ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
            Colaborador colaborador = colaboradorBuilder
                    .setId(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarColaboradorValido() {
        ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
        Colaborador colaborador = colaboradorBuilder
                .setId(1)
                .setNome("Colaborador1")
                .build();

        assertNotNull(colaborador);
    }
    
}
