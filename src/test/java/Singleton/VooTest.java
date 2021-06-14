package Singleton;

import org.junit.Test;
import static org.junit.Assert.*;

public class VooTest {

    @Test
    public void deveRetornarCodigo() {
        Voo.getInstance().setCodigo("AirbusA320-11");
        assertEquals("AirbusA320-11", Voo.getInstance().getCodigo());
    }

    @Test
    public void deveRetornarNumPassageiros() {
        Voo.getInstance().setNumPassageiros(200);
        assertEquals(200, Voo.getInstance().getNumPassageiros());
    }

}
