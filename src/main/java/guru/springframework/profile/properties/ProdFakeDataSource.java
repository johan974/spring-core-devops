package guru.springframework.profile.properties;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdFakeDataSource implements FakeDataSource {
    @Override
    public String getConnectionInfo() {
        return "I am a PROD DS connection";
    }
}
