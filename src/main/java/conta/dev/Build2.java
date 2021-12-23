package conta.dev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        // adaptadores frontend javafx
        {"conta.dev",
         "conta.tela",
        // objetos de sistema
         "conta.sistema",
        // adaptadores falsos
         "conta.adaptador"
})
public class Build2 {
    // Build 2: JavaFx -> Sistema <- Adaptadores Mock
}
