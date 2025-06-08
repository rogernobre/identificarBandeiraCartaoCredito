package br.com.rogernobre.identificadorbandeiracartao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IdentificadorBandeiraCartaoApplicationTest {

    @Test
    void contextLoads() {
        // This test ensures that the Spring application context loads successfully.
    }

    @Test
    void mainMethodRunsApplication() {
        // This test verifies that the main method runs without exceptions.
        Assertions.assertDoesNotThrow(() -> IdentificadorBandeiraCartaoApplication.main(new String[] {}));
    }
}