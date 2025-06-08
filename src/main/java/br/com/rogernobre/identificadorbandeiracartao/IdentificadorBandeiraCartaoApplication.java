package br.com.rogernobre.identificadorbandeiracartao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IdentificadorBandeiraCartaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdentificadorBandeiraCartaoApplication.class, args);
    }

    @GetMapping("/api/bandeira")
    public String identificarBandeira(@RequestParam String numeroCartao) {
        // Lógica simples para identificar bandeira (exemplo fictício)
        if (numeroCartao.startsWith("4")) {
            return "Visa";
        } else if (numeroCartao.startsWith("5")) {
            return "MasterCard";
        } else {
            return "Bandeira desconhecida";
        }
    }
}