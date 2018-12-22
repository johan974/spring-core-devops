package guru.springframework.profile.properties;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevFakeDataSource implements FakeDataSource {
    @Override
    public String getConnectionInfo() {
        return "I am a DEV DS connection";
    }
}
