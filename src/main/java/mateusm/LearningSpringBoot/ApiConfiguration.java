package mateusm.LearningSpringBoot;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfiguration {

    private DefaultApiInitializer defaultApiInitializer;


    private Boolean ApiStarted;

    public ApiConfiguration(DefaultApiInitializer defaultApiInitializer) {
        this.defaultApiInitializer = defaultApiInitializer;
        ApiStarted = this.defaultApiInitializer.start();
    }


    public String getMessage() {
        if (ApiStarted) {
            return "Api configurada com sucesso!";
        }
        return "Api não configurada! Erro ao incializar.";
    }

    public Boolean restart() {
        this.defaultApiInitializer = new DefaultApiInitializer();
        ApiStarted = this.defaultApiInitializer.start();

        return ApiStarted;
    }
}
