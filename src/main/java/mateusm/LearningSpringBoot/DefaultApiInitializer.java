package mateusm.LearningSpringBoot;

import org.springframework.stereotype.Component;

@Component("defaultApiInitializer")
public class DefaultApiInitializer {
    public Boolean start() {
        return true;
    }
}
