package br.com.rogernobre.identificadorbandeiracartao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BandeiraController {

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
