package br.com.rogernobre.identificadorbandeiracartao.controller;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
class BandeiraControllerTest {

    @Autowired
    BandeiraController controller;

    @ParameterizedTest
    @ValueSource(strings = { "4111111111111111" })
    void testIdentificarBandeiraVisa(String numeroCartao) {
        String response = controller.identificarBandeira(numeroCartao);

        assertEquals("Visa", response);
    }

    @ParameterizedTest
    @ValueSource(strings = { "5111111111111111" })
    void testIdentificarBandeiraMasterCard(String numeroCartao) {
        String response = controller.identificarBandeira(numeroCartao);

        assertEquals("MasterCard", response);
    }

    @ParameterizedTest
    @ValueSource(strings = { "6111111111111111" })
    void testIdentificarBandeiraDesconhecida(String numeroCartao) {
        String response = controller.identificarBandeira(numeroCartao);

        assertEquals("Bandeira desconhecida", response);
    }
}