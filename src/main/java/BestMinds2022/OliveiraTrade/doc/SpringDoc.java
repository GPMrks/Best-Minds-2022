package BestMinds2022.OliveiraTrade.doc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @io.swagger.v3.oas.annotations.info.Info(
                title = "Oliveira Trade Criação de Usuário",
                version = "${api.version}",
                contact = @Contact(
                        name = "Guilherme M.", email = "guilhermepereiramarques@hotmail.com", url = "https://www.linkedin.com/in/guilherme-p-marques/"
                ),
                license = @io.swagger.v3.oas.annotations.info.License(
                        name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"
                ),
                termsOfService = "${tos.uri}",
                description = "${api.description}"
        ),
        servers = @Server(
                url = "${api.server.url}",
                description = "Development"
        )
)
public class SpringDoc {
}
