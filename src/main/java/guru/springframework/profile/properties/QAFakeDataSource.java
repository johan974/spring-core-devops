package guru.springframework.profile.properties;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class QAFakeDataSource implements FakeDataSource {
    @Override
    public String getConnectionInfo() {
        return "I am a QA DS connection";
    }
}
