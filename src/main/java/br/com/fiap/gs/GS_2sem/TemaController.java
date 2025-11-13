// Teste CD - Workflow

package br.com.fiap.gs.GS_2sem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class TemaController {

    @GetMapping("/info")
    public Map<String, String> getInfo() {
        return Map.of(
            "tema", "Aplicativos para conciliar vida pessoal e profissional",
            "membro1", "Pedro Cavariani - RM 551380",
            "membro2", "Paulo Henrique Lima - RM 552444",
            "descricao", "Esta API propõe soluções para equilibrar a rotina de trabalho e vida pessoal, oferecendo ferramentas para gestão de tempo, bem-estar e produtividade saudável."
        );
    }
}

