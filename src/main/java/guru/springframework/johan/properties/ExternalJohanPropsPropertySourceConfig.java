package guru.springframework.johan.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:johan.properties")
public class ExternalJohanPropsPropertySourceConfig {

    @Value("${johan.firstname}")
    String johanFirstname;

    @Value("${johan.lastname}")
    String johanLastname;

    @Bean
    public JohanProperties getJohanProperties() {
        JohanProperties johanProperties = new JohanProperties();
        johanProperties.setFirstname(johanFirstname);
        johanProperties.setLastname(johanLastname);
        return johanProperties;
    }
}