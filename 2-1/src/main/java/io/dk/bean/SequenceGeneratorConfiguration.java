package io.dk.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceGeneratorConfiguration {

    @Bean
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        sequenceGenerator.setPrefix("prefix");
        sequenceGenerator.setSuffix("suffix");
        sequenceGenerator.setInitial(100000);
        return sequenceGenerator;
    }
}
