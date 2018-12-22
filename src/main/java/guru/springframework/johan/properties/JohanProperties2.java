package guru.springframework.johan.properties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
@PropertySource( { "classpath:testing.properties"})
public class JohanProperties2 {
    Environment environment;

    public String getFirstname() {
        return environment.getProperty( "johan.firstname");
    }
    public String getLastname() {
        return environment.getProperty( "johan.lasttname");
    }
}
